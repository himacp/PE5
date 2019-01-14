/*
   The program  will check whether the array contains "Apple" replace it
   to "Kiwi" and "Melon"  to "Mango"
    */
package com.stackroute.wave4;

import java.util.ArrayList;
import java.util.List;

    public class SpecifiedArrayElement{
        public List<String> upspecificElement(List<String> inputString, String keyword) {
            if (inputString!=null) {
                List<String> string = new ArrayList<>();
                for (int i = 0; i < inputString.size(); i++) {
                    if (inputString.get(i).contains(keyword)) {
                        inputString.set(i, "kiwi");
                    } else if (inputString.get(i).contains("melon")) {
                        inputString.set(i, "mango");
                    }
                }
                return inputString;
            }
            return null;
        }

        public List<String> emptyArrayList(List<String> inputString) {
            inputString.clear();

            return inputString;
        }
    }