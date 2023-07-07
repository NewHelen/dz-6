package org.example;

import java.util.*;

public class Exercise9 {

    public Set<Character> myFunction(String[] array) {
        return getSymbolSet(findWordsWithDoubleChars(array, 2));
    }

    private ArrayList<String> findWordsWithDoubleChars(String[] array, int limit) {
        ArrayList<String> result = new ArrayList<>();
        for (String str : array) {
            boolean isGood = true;
            char[] myCharsArray = str.toCharArray();
            for (int i = 0; i < myCharsArray.length; i++) {
                int dublicates = 1;
                for (int j = 0; j < myCharsArray.length; j++) {
                    if (i == j) continue;    //tha same letter
                    if (myCharsArray[i] == myCharsArray[j]) {
                        dublicates++;
                    }
                }
                if (dublicates % 2 == 1) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) result.add(str);
            if (result.size() == 2) break;
        }
        return result;
    }

    private Set<Character> getSymbolSet(ArrayList<String> strings) {
        Set result = new HashSet();
        for (String str : strings) {
            char[] myCharsArray = str.toCharArray();
            int i =0;
            while (i < myCharsArray.length){
                result.add(myCharsArray[i]);
                i++;
            }
        }
        return result;
    }
}