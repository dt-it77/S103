package Nivell1_ex8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedHashMap<String,String> listLinkedHashMap = new LinkedHashMap<String,String>();
        listLinkedHashMap.put("Java", "Oracle");
        listLinkedHashMap.put("NodeJS", "Joyent");
        listLinkedHashMap.put("C#", "Microsoft");
        listLinkedHashMap.put("PHP", "The PHP Group");
        listLinkedHashMap.put("Rust", "Mozilla");
        listLinkedHashMap.put("Swift", "Apple");
        listLinkedHashMap.put("Python", "Python Software Foundation");
        listLinkedHashMap.put("Go", "Google");
        //sense ordre
        System.out.println(listLinkedHashMap);

        //ordenem per amb ArrayList
        List<Map.Entry<String,String>> listArrayList = new ArrayList<>(listLinkedHashMap.entrySet());
        listArrayList.sort(Entry.comparingByKey());
        listLinkedHashMap.clear();
        for (Map.Entry<String,String> entry : listArrayList) {
            listLinkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(listLinkedHashMap);
        //TreeMap ordena per ordre natural per keys
        /*SortedMap<String,String> sortedTreeMap = new TreeMap<String,String>(listLinkedHashMap);
        listLinkedHashMap.clear();
        for (String key : sortedTreeMap.keySet()) {
            listLinkedHashMap.put(key, sortedTreeMap.get(key));
        }
        System.out.println(listLinkedHashMap);*/
    }
    
}
