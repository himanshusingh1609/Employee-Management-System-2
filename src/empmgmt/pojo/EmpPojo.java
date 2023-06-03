
package empmgmt.pojo;


public class EmpPojo 
{
    
    public EmpPojo(){
        
    }

    @Override
    public String toString() {
       return empNo + "\t" + empName + "\t" + empSal;
    }

    public EmpPojo(int empNo, String empName, double empSal) 
    {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpNo() 
    {
        return empNo;
    }

    public void setEmpNo(int empNo) 
    {
        this.empNo = empNo;
    }

    public String getEmpName() 
    {
        return empName;
    }

    public void setEmpName(String empName) 
    {
        this.empName = empName;
    }

    public Double getEmpSal() 
    {
        return empSal;
    }

    public void setEmpSal(Double empSal) 
    {
        this.empSal = empSal;
    }
    private int empNo;
    private String empName;
    private Double empSal;
}
