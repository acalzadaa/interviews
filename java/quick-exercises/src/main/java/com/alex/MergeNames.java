package com.alex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
    	ArrayList<String> listOfNames = new ArrayList<String>();
    	
    	for (int i = 0; i < names1.length; i++) {
			listOfNames.add(names1[i]);
		}
  	
    	
    	for (int i = 0; i < names2.length; i++) {
			listOfNames.add(names2[i]);
		}
    	
    	//eliminate the repeated ones
        HashSet<String> uniqueListOfNames = new HashSet<String>(listOfNames);
    	String[] arrayOfNames = new String[uniqueListOfNames.size()];
    	arrayOfNames = uniqueListOfNames.toArray(arrayOfNames);
    	return arrayOfNames;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}