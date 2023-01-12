package Comparator_Arralist_Hashset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
//        // Difference between List and HashSet (No Duplicates, Order)
//        Set<String> names = new HashSet<>();
//
//        names.add("Akib");
//        names.add("Helena");
//        names.add("Walter");
//        names.add("Walter");
//
//        names.remove("Walter");
//        names.remove(0); // Doesn't Work
//        names.contains("Helena");
//        names.isEmpty();
//        names.clear();
//        names.forEach(System.out::println);
//        Iterator<String> namesIterator = names.iterator();
//        while (namesIterator.hasNext()){
//            System.out.println(namesIterator.next());
//        }
//        for( String name: names){
//            System.out.println(name);
//        }

        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(100,12,3,3,1,10));
//        Set<Integer> nonDuplicate =new HashSet<>(temp);
//        Set<Integer> nonDuplicate =new LinkedHashSet<>(temp);
        Set<Integer> nonDuplicate =new TreeSet<>(temp);
        System.out.println(nonDuplicate);




        // TreeSet (Alphabetical Natural Ordering)
        // LinkedHashSet (Actual Ordering)
        // Hashset is way faster< LinkedHashSet < TreeSet

//        System.out.println(names);
    }
}