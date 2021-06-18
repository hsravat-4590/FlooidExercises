package com.example.task2.library;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CamelCase {

    /**
     * Converts an array of strings into a single string in Camel Case.
     *
     * @param value a string split with a space for each element
     * @return This sample input will output a string: ToCamelCase
     */
    public String toCamelCase(@NotNull String value) throws IllegalArgumentException {
        String[] array;
        if (StringUtils.isBlank(value)) {
            throw new IllegalArgumentException("The parameter must include content");
        }
        array = value.split(" ");
        StringBuilder sb = new StringBuilder();
        Consumer<String> converter = s -> {
            s = s.toLowerCase();
            String capitalised = s.substring(0, 1).toUpperCase() + s.substring(1);
            sb.append(capitalised);
        };
        String element1 = array[0];
        sb.append(element1.toLowerCase());
        List<String> elements = new ArrayList<>(Arrays.asList(array));
        elements.remove(0);
        elements.forEach(converter);
        return sb.toString();
    }
}