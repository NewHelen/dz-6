package org.example;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Exercise9 ex = new Exercise9();

        String[] strings = {"mama", "papapa", "test", "dada"};

        Set<Character> set = ex.myFunction(strings);
        for (Character ch : set) {
            System.out.print(ch);
        }
    }
}