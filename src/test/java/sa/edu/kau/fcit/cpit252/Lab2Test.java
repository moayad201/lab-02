package sa.edu.kau.fcit.cpit252;

import org.junit.Test;
import sa.edu.kau.fcit.cpit252.logging.Logger;

import static org.junit.Assert.assertEquals;

public class Lab2Test {

    // Should restrict the instantiation  of the Logger class to a singular instance.
    @Test
    public void ShouldBeSingleton() {
        Logger log1 = Logger.getLoggerInstance();
        Logger log2 = Logger.getLoggerInstance();
        assertEquals(log1, log2);
    }
}