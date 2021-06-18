import buffer.Buffer;
import buffer.UnboundedBuffer;
import consumer.DataConsumer;
import model.Range;
import producer.DataProducer;
import util.CommonUtil;

public class Runner {

    public static void main(final String[] args) throws InterruptedException {

        Buffer<Integer> dataBuffer = new UnboundedBuffer<>();
        Range timeRange = getTimeRange();
        Range numberRange = getNumberRange();
        DataProducer dataProducer = new DataProducer(10, timeRange, numberRange, dataBuffer);
        DataConsumer dataConsumer = new DataConsumer(dataBuffer);
        dataProducer.start();
        CommonUtil.sleep(50);
        dataConsumer.start();
    }

    private static Range getTimeRange() {
        return new Range(1, 5);
    }

    private static Range getNumberRange() {
        return new Range(0, 100);
    }
}
