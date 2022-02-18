package Nivell1_ex6;

import java.util.LinkedList;
import java.util.ListIterator;


public class App {

    public static final Integer numeroValorsAIntroduir = 11;
    public static void main(String[] args) throws Exception {
        
        LinkedList<Integer> list = new LinkedList<Integer>();    
        Integer count = 0;
        while(count < numeroValorsAIntroduir){
            ListIterator<Integer> iterator = list.listIterator();
            count ++;
            //avancem amb metode next del iterator fins la meitat de la llista
            for(int i=0;i < list.size()/2;i++){
                iterator.next();
            }
            iterator.add(count);

        }
        System.out.println(list);
        
        //sense itertor
        /*LinkedList<Integer> list2 = new LinkedList<Integer>();   
        Integer count2 = 0; 
        while(count2 < numeroValorsAIntroduir){
            count2 ++;
            list2.add(list2.size()/2, count2);
        }

        System.out.println(list2);*/
    }

    
}
