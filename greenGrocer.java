import java.util.Scanner;

public class greenGrocer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        /*We can assign the values of our codes as I wrote this
         * double pearPrice = 2.14;
         * double applePrice = 3,67;
         * double tomatoPrice = 1,11;
         * double bananaPrice = 0,95;
         * double eggplantPrice = 5,00;
         */
        
        
        
        System.out.println("How Many Kg Of Pears?");
        double pear = input.nextDouble();

        System.out.println("How Many Kg Of Apple?");
        double apple = input.nextDouble();

        System.out.println("How Many Kg Of Tomato?");
        double tomato = input.nextDouble();

        System.out.println("How Many Kg Of Banana?");
        double banana = input.nextDouble();

        System.out.println("How Many Kg Of EggPlant?");
        double eggplant = input.nextDouble();

        //  Here we converted the Double Result to Int with the Casting Operation
        
        double total = (int) (pear * 2.14) + (apple * 3.67) +
         (tomato * 1.11)+ (banana * 0.95) + (eggplant * 5.00);

        System.out.println("Total Price: " + total + " Turkish Lira");

        //We have closed the code here to prevent source leakage
        input.close();
    }
}
