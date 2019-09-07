/*
 */

package pack;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kenny
 */
public class PersonTest {

    //Person person = new Person("Kenny","Hoang","male");
    
    Person person = new Person("Eren","Mikasha","titans");
    
    @Test
    public void test1(){
        assertEquals("Eren",person.getName());
    }
}
