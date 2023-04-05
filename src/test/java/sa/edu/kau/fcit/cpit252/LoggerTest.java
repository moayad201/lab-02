package sa.edu.kau.fcit.cpit252;

import org.junit.Test;
import sa.edu.kau.fcit.cpit252.logging.Logger;

import static org.junit.Assert.assertEquals;

public class LoggerTest {

    @Test
    public void shouldBeIdenticals()
    {
        Logger log1 = new Logger();
        Logger log2 = new Logger();
        assertEquals(log1, log2);
    }
}
