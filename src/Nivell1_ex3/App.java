package Nivell1_ex3;

public class App {
    public static final int numeroVisualizacions = 7;

    public static void main(String[] args) throws Exception {
        Generadora generadora = new Generadora();
        System.out.println("Cridem el metode seguentPersonatge() " + numeroVisualizacions+ " cops.");
        for(int i = 1;i <= numeroVisualizacions;i++){
            System.out.println(generadora.seguentPersonatge());
        }
        System.out.println("LinkedList");
        for (String string : generadora.c2) {
            System.out.println(string);
        }
        System.out.println("HashSet");
        for (String string : generadora.c3) {
            System.out.println(string);
        }
        System.out.println("LinkedHashSet");
        for (String string : generadora.c4) {
            System.out.println(string);
        }
        System.out.println("TreeSet");
        for (String string : generadora.c5) {
            System.out.println(string);
        }

    }
}
