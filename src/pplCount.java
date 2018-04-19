/*
Project 8
Your program will take an input.txt file OR put basic info that has person's last name and their state(2 characters) in US.

You need store name and states in the order of last name. At the end, you must print in the order of state with how many residence in each state.

Duplicate names are not allowed within same state.


 */

import java.io.*;
import java.util.*;

public class pplCount {

    private static Map<String, Integer> countMap = new HashMap<String, Integer>();

// add people-persona -
    public static void main(String[] args) {
        LinkedHashMap<String, String> persona = new LinkedHashMap<String, String>();
        persona.put("Rosh", "NY");
        persona.put("Zorro", "NY");
        persona.put("Adams", "NJ");
        persona.put("Bond", "NJ");
//        persona.put("Bond NJ", "NJ");

//        persona.put("Rosh", "nj");
        System.out.println("People in states:");
        countPpl(persona);

    }

    //count
    public static void countPpl(LinkedHashMap ppl1){
        Set keys = ppl1.keySet();
        Iterator itr = keys.iterator();
        while(itr.hasNext()){
            String value = (String) ppl1.get(itr.next());
            String[] valueArray = value.split(" ");
            for(String s:valueArray){
                Integer count = countMap.get(s);
                if(count != null){
                    countMap.put(s, ++count);
                }else{
                    countMap.put(s, 1);
                }
            }
        }

        //display ppl in states
        for(Map.Entry<String, Integer> entrySet: countMap.entrySet()){
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

    }
}
