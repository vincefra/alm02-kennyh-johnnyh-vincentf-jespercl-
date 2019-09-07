/*
 */

package pack;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author kenny
 */
public class TranslatorTest {

    ArrayList<String> answerList = new ArrayList<>();
    
    @Test
    public void test1(){
        answerList.add("test");
        assertEquals(answerList.size(), 1);
    }
}
