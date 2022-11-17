package n2019;

import java.util.*;

public class queThree {
    public static <T> Set<T> mergeSet(Set<String> names, Set<Integer> ids){
        Set<T> mergedSet = new HashSet<T>();//empty hashset
        mergedSet.addAll((Collection<? extends T>) names);
        mergedSet.addAll((Collection<? extends T>) ids);
        return mergedSet;
    }
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();//main list
        Set<String> names = new HashSet<String>();//set 1
        names.addAll(Arrays.asList("Eme","Emel", "Emeda"));
        //names.add("Emelda");
        //names.add("Immaculate");
        //names.add("Melody");
        Set<Integer> ids = new HashSet<Integer>();
        ids.addAll(Arrays.asList(123, 234, 567));
        //ids.add(123);
        //ids.add(456);
        //ids.add(789);
        System.out.println("Names set: " + names);
        System.out.println("Ids set: "+ ids);
        System.out.println("Merged: " + mergeSet(names, ids));
        students.add(names.toString());
        students.add(ids.toString());
        System.out.println("unserted :" + students);
        //students.sort(Collections.reverseOrder());
        //System.out.println("descending order: "+ students);
        //Collections.sort(students);
        //System.out.println("Ascending: "+ students);
    }
}
