/*
 */



import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author eren
 */
public class TranslatorTest {

    public static final Logger LOG = Logger.getLogger(PersonTest.class.getName());
    ArrayList<String> answerList = new ArrayList<>();
    
    @Test
    public void test1(){
        
        answerList.add("test");
        LOG.log(Level.INFO, "Testing the method of array size, if adding works correctly - size:" + answerList.size());
        assertEquals(answerList.size(), 1);
    }
}
