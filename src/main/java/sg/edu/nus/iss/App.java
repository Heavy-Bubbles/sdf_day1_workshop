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
                //replace comma with space
                input = input.replace(',', ' ');

                Scanner scan = new Scanner(input.substring(4));

                String content = "";
                while (scan.hasNext()){
                    content = scan.next();

                    if (cart.contains(content)) {
                        System.out.println(content + " already in cart!");
                    } else {
                        cart.add(content);
                        System.out.println(content + " added to cart.");         
                }
            }
        }

            if (input.equals("list")) {
                if (cart.size() < 1) {
                    System.out.println("Your cart is empty!");
                } else {
                    int i = 0;
                    for (String item : cart) {
                        i++;
                        System.out.println(i + ". " + item);
                    }
                }
                }

            if (input.startsWith("delete")) {
                    Scanner scan = new Scanner(input.substring(6));

                    String content = "";
                    while (scan.hasNext()) {
                        content = scan.next();

                        int listIndex = Integer.parseInt(content);

                        if (listIndex <= cart.size()) {
                            System.out.println(cart.get(listIndex - 1) + " removed from cart.");
                            cart.remove(listIndex - 1);
                        } else {
                            System.err.println("Incorrect item index!");
                        }
                    }


            }

           
        }
        System.out.println("Bye bye!");
    }
}
