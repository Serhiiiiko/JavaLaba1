public class Employee {
    private int id;
    private int nextid = 0;
    private double salary;
    private String name, surname;

    public Employee(String name) throws FieldLengthLimitException {
        this.id=nextid++;
        if(name.length()>15){
            throw new FieldLengthLimitException("Too much sumbols in name!");
        }
        else{
            this.name = name;
        }
    }
    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name"+name);
    }
}