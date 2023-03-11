import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogTest {
    private static final Logger LOG = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void shouldLogSomething() throws Exception {
        LOG.info("INFO -> Something");
        LOG.warn("WARN -> Something");
        LOG.error("ERROR -> Something");
        LOG.debug("DEBUG -> Something");
        LOG.trace("TRACE -> Something");

        SimpleFlinkFunction incrementer = new SimpleFlinkFunction();

        // call the methods that you have implemented
        assertEquals(3L, incrementer.map(2L));
    }
}
