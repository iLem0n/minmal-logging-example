import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.functions.MapFunction;

@Slf4j
public class SimpleFlinkFunction implements MapFunction<Long, Long> {

    @Override
    public Long map(Long record) throws Exception {
        log.info("INFO -> SimpleFlinkFunction");
        log.warn("WARN -> SimpleFlinkFunction");
        log.error("ERROR -> SimpleFlinkFunction");
        log.debug("DEBUG -> SimpleFlinkFunction");
        log.trace("TRACE -> SimpleFlinkFunction");
        return record + 1;
    }
}
