package mysimplebank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddnumbersTest{
    @Test
    void addnum(){
        Addnumbers calculator=new Addnumbers();
        int result= calculator.add(3,5);
        assertEquals(8, result, "it a success");
    }
}

