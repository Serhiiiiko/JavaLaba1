import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BaseTests1 {
    @Test

    void EmloyeeTest(){
        String name = "Arseeeeeeeeen";
        double salary = 10;
        try{
            Employee emp = new Employee(name, salary);
        }
        catch(FieldLengthLimitException ex){
            Logger.getLogger(BaseTests1.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IncorrectSalaryException ex){
            Logger.getLogger(BaseTests1.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals(name, salary, 10, 0);
    }
}
