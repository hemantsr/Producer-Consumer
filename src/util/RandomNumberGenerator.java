package util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    public static int generateRandomNumber(final int start,
                                           final int end) {
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }
}
