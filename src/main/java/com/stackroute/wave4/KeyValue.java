/**
 * a method that accepts a Map object having two key-value pairs with the
 * keys val1 and val2.Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `"  "` (empty string ).
 * Example 1:The map {"val1": "java", "val2": "c++"} should
 * return {"val1": " ", "val2":"java"}
 * Example 2:The map {"val1": "mars", "val2": "saturn"}
 * should return {"val1": " ", "val2":"mars"}
 */
package com.stackroute.wave4;
import java.util.Iterator;
import java.util.Map;

public class KeyValue {
    /*
        This method will change the first key's value to " "
        and then put the value of first key in second key and then return
        the Map.
     */
    public Map<String,String> changeTwoKeyValue( Map<String,String> originalMap)
    {
        Iterator<Map.Entry<String,String> > iterator=originalMap.entrySet().iterator();
        String eachKeyInMap="";
        String value="";
        int flag=0;
        //Checking if the Map is empty
        if( !iterator.hasNext() )
        {
            return null;
        }
        // Looping through the map and changing values,
        while( iterator.hasNext() )
        {
            Map.Entry<String,String> myEntry=iterator.next();
            eachKeyInMap=(String) myEntry.getKey();
            if( eachKeyInMap != null && flag == 0)
            {
                value = (String) myEntry.getValue();
                originalMap.put(eachKeyInMap," ");
                flag=1;
            }
            else if( eachKeyInMap != null  && flag ==1 )
            {
                originalMap.put(eachKeyInMap,value);
            }
        }
        return originalMap;

    }
}
