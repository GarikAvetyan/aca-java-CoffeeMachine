package ACA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Machine coffee = new Machine(1000, 1000, 1000, 1000);
        int select;

        do {

            System.out.print("What order do you want?\n" +
                    "1)BUY\n" +
                    "2)FILL\n" +
                    "3)TAKE\n\n" +
                    "SELECT: ");

            select = sc.nextInt();
            System.out.println();

            if (select == 1) {

                System.out.print("What order do you want?\n" +
                        "1)ESPRESSO\n" +
                        "2)LATTE\n" +
                        "3)CAPUCHINO\n\n" +
                        "Type Of Coffee: ");
                int typeOfCoffee = sc.nextInt();
                System.out.print("Cout Of Cups: ");
                int coutOfCups = sc.nextInt();
                System.out.println();

                coffee.buy(typeOfCoffee, coutOfCups);

            } else if (select == 2) {

                System.out.print("Cout Water: ");
                int water = sc.nextInt();

                System.out.print("Cout Milk: ");
                int milk = sc.nextInt();

                System.out.print("Cout Beans: ");
                int beans = sc.nextInt();

                System.out.print("Cout Of Cups: ");
                int cout = sc.nextInt();
                System.out.println();

                coffee.fill(water, milk, beans, cout);

            }
            else if(select==3){

                coffee.take();

            }else{

                System.out.println("Choose one of three options\n");

            }

        } while (select != 3);

    }
}
