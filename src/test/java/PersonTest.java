/*
 */

package pack;

import com.mycompany.fortunetellingmaven.Person;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kenny
 */
public class PersonTest {

    Person person = new Person("Eren","Yeager","titan");
    
    @Test
    public void test1(){
        assertEquals("Eren",person.getName());
    }
}
