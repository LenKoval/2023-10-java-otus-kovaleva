package ru.otus;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

public class HelloOtus {
    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> revList = Lists.reverse(list);
        System.out.println(revList);
    }
}
