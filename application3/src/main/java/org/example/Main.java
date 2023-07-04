package org.example;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"mama","papa","test"};
        function1(strings);

    }

    public static void function1(String[] array){

          for (String str: array){
            System.out.println("The string is: " + str);

            char[] myCharsArray = str.toCharArray();

            System.out.println("Duplicate Characters in above string are: ");

              for (int i = 0; i < str.length(); i++) {
                  for (int j = i + 1; j < str.length(); j++) {
                        if (myCharsArray[i] == myCharsArray[j]) {
                          System.out.println(myCharsArray[j] + " ");

                          break;
                      }
                  }
              }
        }
    }
}


