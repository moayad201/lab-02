package sa.edu.kau.fcit.cpit252;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sa.edu.kau.fcit.cpit252.logging.Logger;



public class LoggerTest {

    @Test
    public void shouldBeIdenticals()
    {
        Logger log1 = Logger.getLoggerInstance();
        Logger log2 = Logger.getLoggerInstance();
        assertEquals(log1, log2);
    }
}