package com.alex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MergeNames2 {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
    	List<String> listOfNames1 = new ArrayList<>(Arrays.asList(names1));
    	List<String> listOfnames2 = new ArrayList<>(Arrays.asList(names2));
    	
    	listOfNames1.addAll(listOfnames2);

    	//eliminate the repeated ones
        HashSet<String> uniqueListOfNames = new HashSet<String>(listOfNames1);
    	
    	String[] arrayOfNames = new String[uniqueListOfNames.size()];
    	arrayOfNames = uniqueListOfNames.toArray(arrayOfNames);
    	
    	return arrayOfNames;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames2.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}