package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ArrayList<String> cart = new ArrayList<String>();

        Console c = System.console();
        String input = c.readLine("Welcome to your shopping cart!");


        if (input.equals("list")) {
            if (cart.size() < 1){
                System.out.println("Your cart is empty!");
            } else {
                System.out.println(cart);
            }
        } else {
            System.err.println("Error! Please type 'list'.");
    }
    }
}

