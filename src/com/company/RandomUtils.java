package com.company;

import org.apache.commons.lang.RandomStringUtils;

/**
 * Author: Rinor Maloku
 * Date: 28.08.2016.
 */
public final class RandomUtils
{
    private RandomUtils(){}

    public static String randomStringOfLength(final int x)
    {
        return RandomStringUtils.randomAlphabetic(x);
    }

    public static String randomPalidhje(final int x) {
        return RandomStringUtils.random(x, new char[]{'w', 'x', 'y', 'z'});
    }
}
