import java.util.Scanner;

public class cToFConverter {
    public static void main(String[] args) {
        double f = 0;
        double c = 0;
        String trash = "";
        Scanner input = new Scanner(System.in);
        boolean done = false;



        System.out.println("Please enter degrees celsuis: ");

        do {
            if (input.hasNextDouble())
            {
                c = input.nextDouble();
                f = (c * 1.8) + 32;
                System.out.println("The degrees farenheit is " + f);
                done = true;
            }
            else {
                trash = input.nextLine();
                System.out.println("Please enter degrees celsius: ");

            }











        } while (!done);;


    }
}