import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String name = "Eric Strumendo";
        String accountType = "CURRENT";
        double balance = 5000;
        int operation = 0;

        while (operation != 4){
            System.out.println("""
                Operations

                1- Check balance
                2- Receive value
                3- Transfer value
                4- Close
        """);

            operation = read.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Balance = "+balance);
                    break;
                case 2:
                    System.out.println("Write a value for receive");
                    double receive = read.nextDouble();
                    balance+= receive;
                    System.out.println("Balance = "+balance);
                    break;

                case 3:
                    System.out.println("Write a value for transfer");
                    double transfer = read.nextDouble();
                    if(transfer <= balance){
                        balance-= transfer;
                        System.out.println("Balance = "+balance);
                    } else {
                        System.out.println("The value for transfer need to be lees than or equal the balance");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }






    }


}
