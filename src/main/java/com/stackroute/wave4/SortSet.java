/**
 * a program to implement set interface which sorts the given randomly ordered
 * names inascending order. Convert the sorted set in to an  array list.
 * Input : Harry  Olive  Alice  Bluto  Eugene
 * Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
 * Array list  from Set :  Alice Bluto Eugene Harry Olive
 */
package com.stackroute.wave4;

import java.util.*;

public class SortSet {
    /*
    This method will sort the set and return after converting
    it into list.
     */
    public List<String> setSorting(HashSet originalSet )
    {
        //Checking whether originalSet is null
        if( originalSet == null)
        {
            return null;
        }
        TreeSet sortedSet= new TreeSet();
        sortedSet.addAll(originalSet);
        List<String> setList = new ArrayList<String>();
            setList.addAll(sortedSet);
        return setList;
    }
}
