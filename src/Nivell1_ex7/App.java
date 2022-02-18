package Nivell1_ex7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;


public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap<String,String> listHashMap = new HashMap<>();
        listHashMap.put("Java", "Oracle");
        listHashMap.put("NodeJS", "Joyent");
        listHashMap.put("C#", "Microsoft");
        listHashMap.put("PHP", "The PHP Group");
        listHashMap.put("Rust", "Mozilla");
        listHashMap.put("Swift", "Apple");
        listHashMap.put("Python", "Python Software Foundation");
        listHashMap.put("Go", "Google");
        System.out.println("HashMap, keys ordenades per ordre d'inserció");
        System.out.println(listHashMap);
        System.out.println("============");
        
        // TreeMap, ordenara per ordre alfabetic segons valor de key
        TreeMap<String, String> sortedTreeMap = new TreeMap<>(listHashMap);
        System.out.println("TreeMap, keys ordenades alfabetic");
        System.out.println(sortedTreeMap);
        System.out.println("============");

        //pasem valors a LinkedHashMap mateix ordre d'inserció que amb el HashMap
        System.out.println("LinkedHashMap, keys ordenades per ordre d'inserció");
        LinkedHashMap<String,String> listLinkedHashMap = new LinkedHashMap<>(listHashMap);
        System.out.println(listLinkedHashMap); //mateix ordre d'inserció que HashMap
        System.out.println("============");

        //HashSet 
        System.out.println("HashSet, keys ordenades per ordre d'inserció");        
        HashSet<String> listHashSet = new HashSet<>(listLinkedHashMap.keySet());
        System.out.println(listHashSet); 
        System.out.println("============");

        //LinkedHashSet 
        System.out.println("LinkedHashSet, keys ordenades per ordre d'inserció");        
        LinkedHashSet<String> listLinkedHashSet = new LinkedHashSet<>(listLinkedHashMap.keySet());
        System.out.println(listLinkedHashSet); 
        System.out.println("============");       
    }
    
}
