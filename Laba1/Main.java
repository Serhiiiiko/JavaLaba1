public class Main {
    public static void main(String[] args){
        try{
            Employee emp=new Employee("Arseniy Biletsky", 200);
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Employee emp=new Employee("Nizar Abushammala", -10);
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }

         try{
            Employee emp=new Employee("Zahar Yuvko", 140);
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}