/**
 * a program to find the number of counts
 * Store the output inMap< String ,Integer> as key value pair.
 * Input :   String  str = “one one -one___two,,three,one @three*one?two”;
 * Output : {"one":5 , "two":2, "three" :2
 */
package com.stackroute.wave4;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    /*
    This method will check the count of the "one","two" and "three" in a
    given string.
     */
    public Map<String,Integer> countNumOfString(String originalString)
    {
        //Check whether Original String is null
        if( originalString == null )
        {
            return null;
        }
        Map<String,Integer> mapValue=new HashMap<String ,Integer>();
        String[] splitString=originalString.split("one",-1);// Splitting by "one"
        mapValue.put("one",splitString.length-1);
        splitString=originalString.split("two",-1);// Splitting by "two"
        mapValue.put("two",splitString.length-1);
        splitString=originalString.split("three",-1);//Splitting by "three"
        mapValue.put("three",splitString.length-1);

        return mapValue;

    }
}
