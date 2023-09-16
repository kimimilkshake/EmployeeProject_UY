package employee.version1;

import java.util.Date;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;


    //Constructors
    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



    double computeSalary() {
        double Salary = 0;

        if(this.totalSales < 50000) {
            Salary = (this.totalSales * 0.05) + this.baseSalary;
        }else if(this.totalSales >= 50000 && this.totalSales < 100000){
            Salary = (this.totalSales * 0.20) + this.baseSalary;
        }else if(this.totalSales >= 100000 && this.totalSales < 500000){
            Salary = (this.totalSales * 0.30) + this.baseSalary;
        }else if(this.totalSales >= 500000){
            Salary = (this.totalSales * 0.50) + this.baseSalary;
        }

        return Salary;
    }

    // Display Info: Shows all the details of the employee along with their salary.
    public void displayInfo() {
        System.out.println("--- Base Plus Commission Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDateHired=" + empDateHired +
                ", empBirthDate=" + empBirthDate +
                ", totalSales=" + totalSales +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
