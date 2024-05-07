package task10.Question_2;

public class Employee {

    private int id;
    private String first_name;
    private String last_name;
    private int salary;

    //Constructor with Arguments
    public Employee(int id, String first_name, String last_name, int salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    //Function to View the ID Using Getters
    public int getID() {
        return id;
    }
    //Function to View the First Name Using Getters
    public String getFirst_name() {
        return first_name;
    }
    //Function to View the Last Name Using Getters
    public String getLast_name() {
        return last_name;
    }
    //Function to View the Salary Using Getters
    public int getSalary() {
        return salary;
    }
    //Function to Set the Salary Using Setters
    public void setSalary(int salary) {
        this.salary = salary;
    }
    //Function to View the Annual Salary Using Getters
    public int getAnnualSalary() {
        salary = salary * 12;
        return salary;
    }

    //Function to Increase the Salary by Particular Percent
    public void raiseSalary(int percent) {
        salary = salary + (salary * percent / 100);
        System.out.println(salary);
    }
}




