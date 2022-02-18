package Nivell1_ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class App {
    private final static String[] arrayStrings = {"string1", "string2", "string3", "string4", "string5"};
    public static ArrayList<String> c1 = new ArrayList<String>();    
    public static LinkedList<String> c2 = new LinkedList<String>();    
    public static HashSet<String> c3 = new HashSet<String>();    
    public static LinkedHashSet<String> c4 = new LinkedHashSet<String>();    
    public static TreeSet<String> c5 = new TreeSet<String>();        
    public static void main(String[] args) throws Exception {
        //omplim llistes
        for(int i = 0;i < arrayStrings.length;i++){
            c1.add(arrayStrings[i]);
            c2.add(arrayStrings[i]);
            c3.add(arrayStrings[i]);
            c3.add(arrayStrings[i]);            
            c4.add(arrayStrings[i]);
            c5.add(arrayStrings[i]);
        }
        
        System.out.println("ArrayList:");
        printString(c1);

        System.out.println("LinkedList:");
        printString(c2);
        
        System.out.println("HashSet:");
        printString(c3);

        System.out.println("LinkedHashSet:");
        printString(c4);

        System.out.println("TreeSet:");
        printString(c5);

    }
    
    public static void printString(Collection<String> stringCollection) {
        Iterator<String> iterator = stringCollection.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
