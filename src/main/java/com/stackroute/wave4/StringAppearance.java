/**
 *  a program where an array of strings is input and
 *  output is a Map< String ,boolean> where each different string  is a key
 *  and its value is true if that  string  appears 2 or more times in the array.
 *  Input : String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 *  Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package com.stackroute.wave4;

import java.util.HashMap;
import java.util.Map;

public class StringAppearance {
    /*
    This method will return Map containing String as Key and count as value
    and check whether its count is equal or more than 2.
     */
        public HashMap<String, Boolean> stringCount(String[] str) {
            HashMap<String, Boolean> count = new HashMap<>();
            for (int i = 0; i < str.length; i++) {
                if (count.containsKey(str[i])) {
                    count.put(str[i], true);
                } else
                    count.put(str[i], false);}
            count.remove("");
            return count; }
    }
