package models;

public class Analyst extends Employee {
    private String employeeId;
    private double allowance;
    private static int count = 1;

    public Analyst(){

    }

    public Analyst(String name, String address, int age, String jobDesc, String placement){
        super(name, address, age, jobDesc, placement);
        if (count < 10){
            this.employeeId = "AL-00" + count;
        }
        else if (count >= 10 && count < 100){
            this.employeeId = "AL-0" + count;
        }
        else {
            this.employeeId = "AL-" + count;
        }
        calculateSalary();
        calculateAllowance();
        count++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Analyst [employeeId=" + employeeId + ", name=" + getName() + ", address=" + getAddress()
                + ", age=" + getAge() + ", salary=" + getSalary() + ", jobDesc=" + getJobDesc()
                + ", placement=" + getPlacement() + "]";
    }

    @Override
    public void calculateSalary() {
        for (int i = 0; i < placementCity.length; i++){
            if (getPlacement().equalsIgnoreCase(placementCity[i])){
                setSalary(ANALYST_SALARY_PERCENTAGE * umk[i]);
                break;
            }
        }
    }

    @Override
    public void calculateAllowance() {
        allowance = ANALYST_ALLOWANCE * getSalary();
    }
}
