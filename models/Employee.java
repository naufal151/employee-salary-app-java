package models;

import interfaces.ISalary;

public class Employee extends Person implements ISalary {
    private String employeeId;
    private double salary;
    private String jobDesc;
    private String placement;
    private static int count = 1;

    public Employee(){

    }

    public Employee(String name, String address, int age, String jobDesc, String placement, boolean incrementCount) {
        super(name, address, age);
        if (incrementCount){
            if (count < 10){
            this.employeeId = "Emp-00" + count;
            }
            else if (count >= 10 && count < 100){
                this.employeeId = "Emp-0" + count;
            }
            else {
                this.employeeId = "Emp-" + count;
            }
            count++;
        }
        this.jobDesc = jobDesc;
        this.placement = placement;
        calculateSalary();
    }

    protected Employee(String name, String address, int age, String jobDesc, String placement) {
        this(name, address, age, jobDesc, placement, false);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", jobDesc=" + jobDesc + ", placement="
                + placement + ", name=" + getName() + ", address=" + getAddress() + ", age" + getAge()
                + "]";
    }

    @Override
    public void calculateSalary() {
        for (int i = 0; i < placementCity.length; i++){
            if (placement.equalsIgnoreCase(placementCity[i])){
                setSalary(umk[i]);
                break;
            }
        }
    }

    @Override
    public void calculateAllowance() {
        
    }
}
