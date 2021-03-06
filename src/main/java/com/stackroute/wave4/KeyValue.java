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
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValue {
    /*
        This method will change the first key's value to " "
        and then put the value of first key in second key and then return
        the Map.
     */
    public LinkedHashMap<String,String > changevalues(LinkedHashMap<String,String>inputmap){
        Iterator itr = inputmap.entrySet().iterator();
        Map.Entry variable = (Map.Entry)itr.next();
        String key1=(String)variable.getKey();
        String value1=(String)variable.getValue();

        variable = (Map.Entry)itr.next();
        String key2=(String)variable.getKey();
        String value2=(String)variable.getValue();

        if(value1!=null) {
            inputmap.put(key1," ");
            inputmap.put(key2,value1);
        }
        return inputmap;}
}

