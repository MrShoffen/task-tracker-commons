package org.mrshoffen.tasktracker.commons.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class OrderIndexGenerator {
    private static final long MIN = 1_000_000;
    private static final long MAX = 5_000_000;

    public static Long next(Long currentMaxOrder) {

        return currentMaxOrder +
                ThreadLocalRandom.current().nextLong(MIN, MAX + 1);
    }
}
