package models;

public class ProjectLeader extends Employee {
    private String employeeId;
    private int totalProject;
    private double allowance;
    private static int plCount = 1;

    public ProjectLeader(){

    }

    public ProjectLeader(String name, String address, int age, String jobDesc, String placement, int totalProject){
        super(name, address, age, jobDesc, placement);
        if (plCount < 10){
            this.employeeId = "PL-00" + plCount;
        }
        else if (plCount >= 10 && plCount < 100){
            this.employeeId = "PL-0" + plCount;
        }
        else {
            this.employeeId = "PL-" + plCount;
        }
        this.totalProject = totalProject;
        calculateSalary();
        calculateAllowance();
        plCount++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "ProjectLeader [employeeId=" + employeeId + ", totalProject=" + totalProject + ", allowance=" + allowance
                + ", name=" + getName() + ", address=" + getAddress() + ", age=" + getAge()
                + ", salary=" + getSalary() + ", jobDesc=" + getJobDesc() + ", placement="
                + getPlacement() + "]";
    }

    @Override
    public void calculateSalary() {
        for (int i = 0; i < placementCity.length; i++){
            if (getPlacement().equalsIgnoreCase(placementCity[i])){
                setSalary(PROJECTLEADER_SALARY_PERCENTAGE * umk[i]);
            }
        }
    }

    @Override
    public void calculateAllowance() {
        if (totalProject >= 2){
            allowance = getSalary() * PROJECTLEADER_ALLOWANCE_MANYPROJECTS;
        }
        else {
            allowance = getSalary() * PROJECTLEADER_ALLOWANCE_LESSPROJECTS;
        }
    }
}
