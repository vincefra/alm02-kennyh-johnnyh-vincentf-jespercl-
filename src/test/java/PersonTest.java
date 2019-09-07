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
    Person person = new Person("Eren","Yeager","Titan");
    public static final Logger LOG = Logger.getLogger(PersonTest.class.getName());
    
    @Test
    public void test1(){
        LOG.log(Level.INFO, "Testing the method of adding data in object, String Eren :{0}", person.getName());
        assertEquals("Eren", person.getName());
        
        LOG.log(Level.INFO, "Testing the method of getGender", person.getGender());
        assertEquals("Titan", person.getGender());
        
        LOG.log(Level.INFO, "Testing the method of getLastname", person.getLastname());
        assertEquals("Yeager", person.getLastname());
    }
}
