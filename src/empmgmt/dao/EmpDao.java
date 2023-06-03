
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao 
{
    public static boolean addEmp(EmpPojo emp)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?)");
        ps.setInt(1, emp.getEmpNo());
        ps.setString(2, emp.getEmpName());
        ps.setDouble(3, emp.getEmpSal());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    public static EmpPojo findEmpByEmpNo(int eno)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from employees where empno=?");
        ps.setInt(1, eno);
        ResultSet rs=ps.executeQuery();
        EmpPojo emp=null;
        if(rs.next()==true)
        {
            emp=new EmpPojo();
            emp.setEmpNo(rs.getInt(1));
            emp.setEmpName(rs.getString(2));
            emp.setEmpSal(rs.getDouble(3));
            
        }
        return emp;
    }
    public static List<EmpPojo> getAllEmployees()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from employees order by empno");
    List<EmpPojo>empList =new ArrayList<>();
    while(rs.next())
    {
        EmpPojo emp=new EmpPojo();
        emp.setEmpNo(rs.getInt(1));
        emp.setEmpName(rs.getString(2));
        emp.setEmpSal(rs.getDouble(3));
        empList.add(emp);
       }
     return empList;
    }  
    public static boolean deleteEmpbyEmpNo(int eno)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from employees where empno=?");
        ps.setInt(1, eno);
        int res=ps.executeUpdate();
        return res == 1;
    }
    public static boolean UpdateEmp(EmpPojo emp)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update employees set empname=? , empsalary=? where empno=?");
        ps.setInt(3, emp.getEmpNo());
        ps.setString(1, emp.getEmpName());
        ps.setDouble(2, emp.getEmpSal());
        int res=ps.executeUpdate();
        return res == 1;
    }
    
    public static EmpPojo getUserDetailsByEmpNo(int empNo) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from employees where empno = ?");
        ps.setInt(1, empNo);
        ResultSet rs = ps.executeQuery();
        EmpPojo emp = null;
        if(rs.next()){
            emp = new EmpPojo(rs.getInt(1), rs.getString(2) , rs.getDouble(3));
        }
        return emp;
    }
}
