import java.util.List;
import java.util.Scanner;

import models.Analyst;
import models.Employee;
import models.Programmer;
import models.ProjectLeader;
import repository.RepositoryEmployee;

public class MainApp {

    static List<Employee> employeeList = RepositoryEmployee.getAllEmployee();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  

        int choice = -1;

        do {
            System.out.println("Selamat datang di Aplikasi Pendataan Karyawan PT. Secret Semut 79");
            System.out.println("Silakan pilih salah satu menu");
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee");
            System.out.println("3. Data Employee");
            System.out.println("4. Data Payroll");
            System.out.println("5. Delete Employee");
            System.out.println("6. Search Employee By Placement");
            System.out.println("0. Exit");

            String input = in.nextLine();
            if (input.matches("[0-6]")) {
                choice = Integer.parseInt(input);
            } else {
                System.out.println("Pilihan salah. Silakan masukkan angka 0 sampai 6");
            }

            switch (choice) {
                case 1:
                    addEmployee(in);
                    break;
                case 2:
                    editEmployee(in);
                    break;
                case 3:
                    dataEmployee();
                    break;
                case 4:
                    dataPayroll();
                    break;
                case 5:
                    deleteEmployee(in);
                    break;
                case 6:
                    searchEmployee(in);
                    break;
                default:
                    break;
            }

        } while (choice != 0);
    }

    public static void addEmployee(Scanner in){
        
        int addChoice = -1;

        do {
            System.out.println("Silakan pilih role Employee (1-4)");
            System.out.println("1. Employee umum");
            System.out.println("2. Programmer");
            System.out.println("3. Project Leader");
            System.out.println("4. Analyst");
            System.out.println("0. Kembali ke main menu");
            String input = in.nextLine();
            if (input.matches("[0-4]")) {
                addChoice = Integer.parseInt(input);
            } else {
                System.out.println("Pilihan salah. Silakan masukkan angka 1 sampai 4");
            }

            switch (addChoice) {
                case 1:
                    addGeneralEmployee(in);
                    break;
                case 2:
                    addProgrammer(in);
                    break;
                case 3:
                    addProjectLeader(in);
                    break;
                case 4:
                    addAnalyst(in);
                    break;
                default:
                    break;
            }
        } while (addChoice != 0);
    }

    public static void addGeneralEmployee(Scanner in){
        System.out.println("Silakan masukkan data diri Employee Umum");
        System.out.println("Masukkan nama Employee: ");
        String name = in.nextLine();
        System.out.println("Masukkan alamat Employee: ");
        String address = in.nextLine();
        System.out.println("Masukkan umur Employee: ");
        int age = in.nextInt();
        System.out.println("Masukkan job description Employee: ");
        in.nextLine();
        String jobDesc = in.nextLine();
        System.out.println("Masukkan placement Employee: ");
        String placement = in.nextLine();

        Employee newEmployee = new Employee(name, address, age, jobDesc, placement, true);
        employeeList.add(newEmployee);
        System.out.println("Berhasil memasukkan data employee baru");
        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        System.out.printf(format, 
            newEmployee.getEmployeeId(), 
            newEmployee.getName(), 
            newEmployee.getAddress(), 
            newEmployee.getAge(), 
            newEmployee.getJobDesc(),
            newEmployee.getPlacement()
        );
        System.out.println(line);
    }

    public static void addProgrammer(Scanner in){
        System.out.println("Silakan masukkan data diri programmer");
        System.out.println("Masukkan nama programmer: ");
        String name = in.nextLine();
        System.out.println("Masukkan alamat programmer: ");
        String address = in.nextLine();
        System.out.println("Masukkan umur programmer: ");
        int age = in.nextInt();
        System.out.println("Masukkan job description programmer: ");
        in.nextLine();
        String jobDesc = in.nextLine();
        System.out.println("Masukkan placement programmer: ");
        String placement = in.nextLine();
        System.out.println("Masukkan bahasa pemrograman programmer: ");
        String programmingLanguage = in.nextLine();
        System.out.println("Masukkan berapa tahun pengalaman programmer: ");
        int experience = in.nextInt();
        in.nextLine();

        Employee newProgrammer = new Programmer(name, address, age, jobDesc, placement, programmingLanguage, experience);
        employeeList.add(newProgrammer);
        System.out.println("Berhasil memasukkan data employee baru");
        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        System.out.printf(format, 
            newProgrammer.getEmployeeId(), 
            newProgrammer.getName(), 
            newProgrammer.getAddress(), 
            newProgrammer.getAge(), 
            newProgrammer.getJobDesc(),
            newProgrammer.getPlacement()
        );
        System.out.println(line);
    }

    public static void addProjectLeader(Scanner in){
        System.out.println("Silakan masukkan data diri Project Leader");
        System.out.println("Masukkan nama Project Leader: ");
        String name = in.nextLine();
        System.out.println("Masukkan alamat Project Leader: ");
        String address = in.nextLine();
        System.out.println("Masukkan umur Project Leader: ");
        int age = in.nextInt();
        System.out.println("Masukkan job description Project Leader: ");
        in.nextLine();
        String jobDesc = in.nextLine();
        System.out.println("Masukkan placement Project Leader: ");
        String placement = in.nextLine();
        System.out.println("Masukkan berapa total project yang dipegang Project Leader: ");
        int totalProject = in.nextInt();
        in.nextLine();

        Employee newProjectLeader = new ProjectLeader(name, address, age, jobDesc, placement, totalProject);
        employeeList.add(newProjectLeader);
        System.out.println("Berhasil memasukkan data employee baru");
        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        System.out.printf(format, 
            newProjectLeader.getEmployeeId(), 
            newProjectLeader.getName(), 
            newProjectLeader.getAddress(), 
            newProjectLeader.getAge(), 
            newProjectLeader.getJobDesc(),
            newProjectLeader.getPlacement()
        );
        System.out.println(line);
    }

    public static void addAnalyst(Scanner in){
        System.out.println("Silakan masukkan data diri Analyst");
        System.out.println("Masukkan nama Analyst: ");
        String name = in.nextLine();
        System.out.println("Masukkan alamat Analyst: ");
        String address = in.nextLine();
        System.out.println("Masukkan umur Analyst: ");
        int age = in.nextInt();
        System.out.println("Masukkan job description Analyst: ");
        in.nextLine();
        String jobDesc = in.nextLine();
        System.out.println("Masukkan placement Analyst: ");
        String placement = in.nextLine();

        Employee newAnalyst = new Analyst(name, address, age, jobDesc, placement);
        employeeList.add(newAnalyst);
        System.out.println("Berhasil memasukkan data employee baru");
        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        System.out.printf(format, 
            newAnalyst.getEmployeeId(), 
            newAnalyst.getName(), 
            newAnalyst.getAddress(), 
            newAnalyst.getAge(), 
            newAnalyst.getJobDesc(),
            newAnalyst.getPlacement()
        );
        System.out.println(line);
    }

    public static void editEmployee(Scanner in){
        System.out.println("Silakan masukkan Employee ID: ");
        String employeeId = in.nextLine();

        for (Employee employee : employeeList) {
            if (employeeId.equalsIgnoreCase(employee.getEmployeeId())){
                String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
                String line = "+--------------+--------------+------------+-------+-----------------+------------+";
                System.out.println(line);
                System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
                System.out.println(line);
                System.out.printf(format, 
                    employee.getEmployeeId(), 
                    employee.getName(), 
                    employee.getAddress(), 
                    employee.getAge(), 
                    employee.getJobDesc(),
                    employee.getPlacement()
                );
                System.out.println(line);

                System.out.println("Silakan edit nama employee: ");
                String name = in.nextLine();
                System.out.println("Silakan edit alamat employee: ");
                String address = in.nextLine();
                System.out.println("Silakan edit umur employee: ");
                int age = in.nextInt();
                System.out.println("Silakan edit job descrition employee: ");
                in.nextLine();
                String jobDesc = in.nextLine();
                System.out.println("Silakan edit placement employee: ");
                String placement = in.nextLine();

                employee.setName(name);
                employee.setAddress(address);
                employee.setAge(age);
                employee.setJobDesc(jobDesc);
                employee.setPlacement(placement);

                if (employee instanceof Programmer){
                    Programmer programmer = (Programmer) employee;

                    System.out.println("Silakan edit bahasa pemrograman programmer: ");
                    String programmingLanguage = in.nextLine();
                    System.out.println("Silakan edit berapa tahun pengalaman programmer: ");
                    int experience = in.nextInt();
                    in.nextLine();

                    programmer.setProgrammingLanguage(programmingLanguage);
                    programmer.setExperience(experience);
                    programmer.calculateSalary();
                    programmer.calculateAllowance();

                    System.out.println(line);
                    System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
                    System.out.println(line);
                    System.out.printf(format, 
                        employee.getEmployeeId(), 
                        employee.getName(), 
                        employee.getAddress(), 
                        employee.getAge(), 
                        employee.getJobDesc(),
                        employee.getPlacement()
                    );
                    System.out.println(line);
                }
                else if (employee instanceof ProjectLeader){
                    ProjectLeader projectLeader = (ProjectLeader) employee;

                    System.out.println("Silakan edit total project yang dimiliki project leader: ");
                    int totalProject = in.nextInt();
                    in.nextLine();

                    projectLeader.setTotalProject(totalProject);
                    projectLeader.calculateSalary();
                    projectLeader.calculateAllowance();

                    System.out.println(line);
                    System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
                    System.out.println(line);
                    System.out.printf(format, 
                        employee.getEmployeeId(), 
                        employee.getName(), 
                        employee.getAddress(), 
                        employee.getAge(), 
                        employee.getJobDesc(),
                        employee.getPlacement()
                    );
                    System.out.println(line);
                }
                else if (employee instanceof Analyst){
                    Analyst analyst = (Analyst) employee;

                    analyst.calculateSalary();
                    analyst.calculateAllowance();

                    System.out.println(line);
                    System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
                    System.out.println(line);
                    System.out.printf(format, 
                        employee.getEmployeeId(), 
                        employee.getName(), 
                        employee.getAddress(), 
                        employee.getAge(), 
                        employee.getJobDesc(),
                        employee.getPlacement()
                    );
                    System.out.println(line);
                }
            }
        }
    }

    public static void dataEmployee(){
        System.out.println("Data semua employee");

        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        for (Employee employee : employeeList) {
            System.out.printf(format, 
                employee.getEmployeeId(),
                employee.getName(),
                employee.getAddress(),
                employee.getAge(),
                employee.getJobDesc(),
                employee.getPlacement());
                System.out.println(line);  
        }
    }

    public static void dataPayroll(){
        double totalSalary = 0;
        double totalAllowance = 0;

        String format = "| %-12s | %-12s | %-15s | %-12s | %-12s | %-10s |%n";
        String line = "+--------------+--------------+-----------------+--------------+--------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Job Desc", "Placement", "Allowance", "Salary");
        System.out.println(line);
        
        for (Employee employee : employeeList) {
            double allowance = 0;
            if (employee instanceof Programmer) {
                Programmer programmer = (Programmer) employee;
                allowance = programmer.getAllowance();
                totalAllowance += allowance;
            } else if (employee instanceof ProjectLeader) {
                ProjectLeader projectLeader = (ProjectLeader) employee;
                allowance = projectLeader.getAllowance();
                totalAllowance += allowance;
            } else if (employee instanceof Analyst) {
                Analyst analyst = (Analyst) employee;
                allowance = analyst.getAllowance();
                totalAllowance += allowance;
            }

            System.out.printf("| %-12s | %-12s | %-15s | %-12s | %-12.2f | %-10.2f |%n",
                    employee.getEmployeeId(),
                    employee.getName(),
                    employee.getJobDesc(),
                    employee.getPlacement(),
                    allowance,
                    employee.getSalary());
            System.out.println(line);
            totalSalary += employee.getSalary();
        }
        double totalPayroll = totalAllowance + totalSalary;
        System.out.printf("| %-12s | %-12.2f | %n", "Total Payroll", totalPayroll);
        System.out.println("+---------------+--------------+");
    }

    public static void deleteEmployee(Scanner in){
        System.out.println("Masukkan Employee ID yang ingin dihapus: ");
        String employeeId = in.nextLine();
        System.out.println("Berhasil menghapus data employee");
        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        for (Employee employee : employeeList) {
            if (employeeId.equalsIgnoreCase(employee.getEmployeeId())){         
                System.out.printf(format, 
                    employee.getEmployeeId(), 
                    employee.getName(), 
                    employee.getAddress(), 
                    employee.getAge(), 
                    employee.getJobDesc(),
                    employee.getPlacement()
                );
                System.out.println(line);
                break;
            }
        }
        employeeList.removeIf(employee -> employee.getEmployeeId().equalsIgnoreCase(employeeId));
    }

    public static void searchEmployee(Scanner in){
        System.out.println("Cari data employee berdasarkan placement");
        System.out.println("Masukkan kota placement: ");
        String placement = in.nextLine();

        String format = "| %-12s | %-12s | %-10s | %-5s | %-15s | %-10s | %n";
        String line = "+--------------+--------------+------------+-------+-----------------+------------+";
        System.out.println(line);
        System.out.printf(format, "Employee ID", "Name", "Address", "Age", "Job Desc", "Placement");
        System.out.println(line);
        for (Employee employee : employeeList) {
            if (placement.equalsIgnoreCase(employee.getPlacement())){
                System.out.printf(format, 
                    employee.getEmployeeId(), 
                    employee.getName(), 
                    employee.getAddress(), 
                    employee.getAge(), 
                    employee.getJobDesc(),
                    employee.getPlacement()
                );
                System.out.println(line);
            }
        }
    }
}
