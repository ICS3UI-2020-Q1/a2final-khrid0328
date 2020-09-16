import java.util.Scanner;

/**
 * This program calculates the subtotal of the
order based on a number of factors, the taxes incurred (13% tax), and the final total.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the pizza size they want to get
    System.out.println("What is the size of the pizza (in cm):");

    // declare and initialize the pizza size
    double pizza_Size = input.nextDouble();

    // define the amount of money payed per pizza for labour
    final double LABOUR_PAYMENT = 0.75;

    // define the amount of money payed per pizza for power to run the ovens
    final double POWER_PAYMENT = 0.99;

    // define the amount of money payed per diameter centimeter of pizza
    final double PER_CENTIMETER_PAYMENT = 0.50;

    // calculate the Subtotal. simplified equation: 0.50 * diameter + 1.74
    double subtotal = LABOUR_PAYMENT + POWER_PAYMENT + PER_CENTIMETER_PAYMENT * pizza_Size;

    // calculate the texes
    double taxes = (subtotal * 13) / 100;

    // calculate the total
    double total = subtotal + taxes;

    // tell user their Subtotal
    System.out.println("Subtotal: $" + subtotal);

    // tell user their taxes
    System.out.println("Taxes: $" + taxes);

    // tell user their total
    System.out.println("Total: $" + total);

    // determine what message should be printed based on pizza size

    if( 1 <= pizza_Size && pizza_Size <= 20){
      System.out.println("We are going to make you a cute little pizza!");

    } else if(20 < pizza_Size && pizza_Size < 40){
      System.out.println("This will be delicious!");

    } else if(40 < pizza_Size){
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }
  }
}
