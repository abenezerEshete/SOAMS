package com.abenezer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List.of("hello", "world").forEach(System.out::println);
    }
}