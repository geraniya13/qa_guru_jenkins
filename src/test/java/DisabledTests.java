import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {
    @Disabled
    @Test
    void test1(){
        assertTrue(false);
    }
    @Disabled("Any reason")
    @Test
    void test2(){
        assertTrue(false);
    }
}
