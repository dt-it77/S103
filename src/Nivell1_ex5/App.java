package Nivell1_ex5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;


public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> llista1 = new ArrayList<Integer>();
        
        for(int i=1;i < 11;i++){
            llista1.add(i);
        }
        System.out.println("Llista 1");
        System.out.println(llista1);


        List<Integer> llista2 = new ArrayList<Integer>(llista1.size());

        //amb iterator iterator
        ListIterator<Integer> llista1Iterator = llista1.listIterator(llista1.size());
        int count = 0;
        while(llista1Iterator.hasPrevious()){
            llista2.add(count, llista1Iterator.previous());
            count++;
        }
        System.out.println("Llista 2 amb iterator");
        System.out.println(llista2);

        //amb un for
        System.out.println("Llista 2 amb for");
        llista2.clear();
        for(int i = llista1.size()-1;i >= 0;i--){
            llista2.add(llista1.get(i));
        }
        System.out.println(llista2);
        //fen servir metode sort
        System.out.println("Llista 2 amb sort");
        llista2.clear();
        //ara la llista 1 esta inversa
        llista1.sort(Comparator.reverseOrder());
        llista2.addAll(llista1);
        //tornem la llista 1 al seu estat inicial. Poc elegant potser
        llista1.sort(Comparator.naturalOrder());
        System.out.println(llista2);
        
        //amb un metode auxiliar
        System.out.println("Llista 2 amb metode");
        llista2.clear();
        llista2.addAll(girarLlista(llista1));
        System.out.println(llista2);

    }
    public static List<Integer> girarLlista(List<Integer> List){
        List<Integer> newList = new ArrayList<Integer>();
        newList = List;
        newList.sort(Comparator.reverseOrder());
        return newList;
    }
}
