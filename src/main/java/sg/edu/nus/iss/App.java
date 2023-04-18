package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart!");

        // collection object to store items
        ArrayList<String> cart = new ArrayList<String>();

        // open console from keyboard
        Console c = System.console();
        String input = "";

        while (!input.equals("quit")) {
            input = c.readLine("Type help to show list of commands.");

            if (input.equals("help")) {
                System.out.println("'list' to show items in shopping cart");
                System.out.println("'add <item>, ...' to add items to cart");
                System.out.println("'delete <item number>' to delete items from cart");
                System.out.println("'quit' to terminate the program");

            }

            if (input.startsWith("add")) {
                Scanner scan = new Scanner(input.substring(4));

                String content = "";
                while (scan.hasNext());
                cart.add(content);
            }

            if (input.equals("list")) {
                if (cart.size() < 1) {
                    System.out.println("Your cart is empty!");
                } else {
                    System.out.println(cart);
                }

                if (input.startsWith("delete")) {
                    Scanner scan = new Scanner(input.substring(6));

                    String content = "";
                    while (scan.hasNext()) {
                        content = scan.next();

                        int listIndex = Integer.parseInt(content);

                        if (listIndex < cart.size()) {
                            cart.remove(listIndex);
                        } else {
                            System.err.println("Incorrect item index!");
                        }
                    }

                }

            }

           
        }
        System.out.println("Bye bye!");
    }
}
