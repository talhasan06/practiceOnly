package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoClass {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);

        Comparator<Integer>com=new CompImp();
        Collections.sort(values,com);

        for (int i:values){
            System.out.println(i);
        }
    }

}
