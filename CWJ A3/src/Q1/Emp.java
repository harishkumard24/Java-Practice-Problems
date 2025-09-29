package Q1;

public class Emp {
    private int empId;
    private String empName;
    private String role;
    private double baseSalary;

    public Emp(int empId, String empName, String role, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRole() {
        return role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void showDetails() {
        System.out.printf("ID: %d, Name: %s, Role: %s, Salary: %.2f\n",
                empId, empName, role, baseSalary);
    }

    public void raiseSalary() {
        baseSalary = baseSalary * 1.10;
    }
}
