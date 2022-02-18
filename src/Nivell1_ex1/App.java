package Nivell1_ex1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Month> months = new ArrayList<Month>();
        months.ensureCapacity(12);

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
        
        System.out.println("**Sense el mes d'agost**");
        //for (Month month : months) {
            System.out.println(months.toString());
        //}
        System.out.println("-----");
        months.add(7, new Month("agost"));
        System.out.println("**Amb el mes d'agost**");
        //amb el mes d'agost
        //for (Month month : months) {
            System.out.println(months.toString());
        //}
    }
}
