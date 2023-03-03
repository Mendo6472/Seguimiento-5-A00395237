import model.Controller;
import java.util.Scanner;

public class Main{

    private static Controller controller;
    private static Scanner sc;

    public static void main(String[] args) {
        controller = new Controller();
        sc = new Scanner(System.in);
        String names = getNames();
        controller.createBst(names);
        System.out.println("Nombres en orden alrevez:" + controller.inOrder());
        System.out.println("Profundidad del arbol: " + controller.getDepth());
    }

    public static String getNames() {
        System.out.println("Ingrese los nombres en una sola linea separados por espacios");
        String names = sc.nextLine();
        return names;
    }

    
}