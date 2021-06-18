package util;

import model.Range;

public class DataProducerUtil {

    public static int getNextNumber(final Range range) {
        return RandomNumberGenerator.generateRandomNumber(
            range.getStart(),
            range.getEnd());
    }

    public static void sleep(final Range range) throws InterruptedException {
        int waitTimeInSec = RandomNumberGenerator.generateRandomNumber(
            range.getStart(),
            range.getEnd());
        CommonUtil.sleep(waitTimeInSec);
    }
}
