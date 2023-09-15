public class Employee {
    private int id;
    private int nextid = 1;
    private double salary;
    private String name;

    public Employee(String name, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextid++;
        if(name.length() > 20){
            throw new FieldLengthLimitException("Too much sumbols in name!");
        }
        if(salary < 0){
            throw new IncorrectSalaryException("Salary cannot be negative");
        }
        else{
            this.name = name;
            this.salary = salary;
        }
    }

    void PrintEmpoyee(){
        System.out.println("ID: "+id+" Name: "+name + " Salary: "+salary + "hrn");
    }
}