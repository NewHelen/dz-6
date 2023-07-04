package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise {

    public Set<String> function1(String[]array){

        ArrayList<String> SomeArray = new ArrayList<>();

        for (String str : array) {

            char[] myCharsArray = str.toCharArray();

            for (int i = 0; i < myCharsArray.length; i++) {
                for (int j = i + 1; j < myCharsArray.length; j++) {
                    if (myCharsArray[i] == myCharsArray[j]) {

                        String valueOfchar = String.valueOf(myCharsArray[j]);
                        SomeArray.add(valueOfchar);

                        break;
                    }
                }
            }
        }
        Set<String> set = new LinkedHashSet<String>(SomeArray);
        return set;
    }

}
