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
    cnd check whether its count is equal or more than 2.
     */
    public Map<String,Boolean> stringAppears( String originalArray[] )
    {
        //checking originalArray is null or empty
        if( originalArray == null || originalArray.length == 0 )
        {
            return null;
        }
        Map<String ,Boolean > stringMap=new HashMap<String, Boolean>();
        int count;
        // Loop will go through originalArray and then check count of each entry
        for( String subString : originalArray )
        {
            count=0;
            stringMap.put(subString,false);
            for(String subString2 : originalArray )
            {

                if( subString.equals(subString2))
                {
                    count++;
                    if( count == 2 )
                    {
                        stringMap.put(subString,true);
                        break;
                    }
                }
            }
        }
        return stringMap;
    }
}
