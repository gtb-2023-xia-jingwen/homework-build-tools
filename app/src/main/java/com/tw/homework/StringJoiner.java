package com.tw.homework;

import com.google.common.base.Joiner;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringJoiner {

    /**
     * Return the string which joined with comma character. Please skip the null element.
     *
     * @param input A list which maybe includes null and String element.
     * @return The joined string.
     */
    public static String join(List<String> input) {
        if (input == null) {
            return "";
        }

        Joiner joiner = Joiner.on(',').skipNulls();
        return joiner.join(input);
    }
}
