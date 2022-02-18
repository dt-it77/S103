package Nivell1_ex2;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Month> months = new HashSet<Month>();
        
        months.add(new Month("gener"));
        months.add(new Month("febrer"));
        months.add(new Month("març"));
        months.add(new Month("abril"));
        months.add(new Month("maig"));
        months.add(new Month("juny"));
        months.add(new Month("juliol"));
        months.add(new Month("septembre"));
        months.add(new Month("octubre"));
        months.add(new Month("novembre"));
        months.add(new Month("decembre"));
        //Creem un object agost i el guardem dues vegades. Nomes haura d'apareixa una vegada
        Month agost = new Month("agost");
        months.add(agost);
        months.add(agost);
        //mostrem resultat
        System.out.println(months.toString());
    }
}
