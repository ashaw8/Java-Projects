/** Aidan Shawyer sh1052394@email.ccbcmd.edu
 * Overview
 * Input 	Output:
 * Plan:
 * 
 */
package finalProj;
import java.util.Scanner;
public class finalProj {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double total = 0, number;
        for (int i = 0; i < 10; i++) {
           
        	while (true) {
                try {
                    System.out.print("Enter a number " + (i + 1) + ": "); // number enter prompt, increases by 1 ea.
                    number = Integer.parseInt(scan.nextLine());
                    total += number;
                    break;
                } catch (NumberFormatException e) { 
                    System.out.println("Invalid number. Try again");
                }
            }
        } System.out.println("Average of entered numbers is " + (total / 10)); // calculate 10 numbers aver. 10
    }
}