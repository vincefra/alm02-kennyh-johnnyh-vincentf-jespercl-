/*
 */


import com.mycompany.fortunetellingmaven.Person;
import java.util.logging.Level;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.logging.Logger;

/**
 *
 * @author kenny
 */
public class PersonTest 
{
    Person person = new Person("Eren","Yeager","titan");
    public static final Logger LOG = Logger.getLogger(PersonTest.class.getName());
    
    @Test
    public void test1(){
        LOG.log(Level.INFO, "Testing the method of adding data in object, String Eren :{0}", person.getName());
        assertEquals("Eren",person.getName());
    }
}
