package Nivell1_ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Generadora {
    private final String personatges[] = {"personatge1", "personatge2", "personatge3", "personatge4", "personatge5"};
    //accadirem desde main
    public ArrayList<String> c1 = new ArrayList<String>();    
    public LinkedList<String> c2 = new LinkedList<String>();    
    public HashSet<String> c3 = new HashSet<String>();    
    public LinkedHashSet<String> c4 = new LinkedHashSet<String>();    
    public TreeSet<String> c5 = new TreeSet<String>();

    private int count = 0;

    public Generadora(){
        for(int i = 0;i < personatges.length;i++){
            c1.add(personatges[i]);
            c2.add(personatges[i]);
            c3.add(personatges[i]);
            c3.add(personatges[i]);            
            c4.add(personatges[i]);
            c5.add(personatges[i]);
        }
    }

    public String seguentPersonatge() {
        String result = c1.get(count).toString();
        if(count == c1.size()-1){
            count = 0;
        }else{
            count++;
        }
        return result;
    }
    
}
