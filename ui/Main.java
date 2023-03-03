import model.Controller;
import java.util.Scanner;

public class Main{

    private static Controller controller;
    private static Scanner sc;

    public static void main(String[] args) {
        controller = new Controller();
        sc = new Scanner(System.in);

        String names = sc.nextLine();
        controller.createBst(names);
        controller.inOrder();
    }

    public static String getNames() {
        String names = "";
        return names;
    }

    
}