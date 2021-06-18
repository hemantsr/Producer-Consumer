package producer;

import buffer.Buffer;
import model.Range;
import util.DataProducerUtil;

public class DataProducer extends Thread {

    private final int maxElement;
    private final Range timeRange;
    private final Range numberRange;
    private final Buffer<Integer> buffer;

    public DataProducer(final int maxElement,
                        final Range timeRange,
                        final Range numberRange,
                        final Buffer<Integer> buffer) {
        this.maxElement = maxElement;
        this.timeRange = timeRange;
        this.numberRange = numberRange;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int index = 0;
        while (index < maxElement) {
            int element = DataProducerUtil.getNextNumber(numberRange);
            System.out.println("Producing Element:" + element);
            buffer.add(element);
            index = index + 1;
            try {
                DataProducerUtil.sleep(timeRange);
            } catch (InterruptedException e) {
               System.out.println("Exception in producer:" + e);
            }
        }
        System.out.println("Producer is shutting down");
    }
}
