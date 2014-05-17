import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class testEvent {
    @Test
    public void testEventObjectIsEqualToItsSelf() throws Exception {
        assertTrue(new EventObj().equals(new EventObj()));
    }
}
