 import java.util.Scanner;
        public class primecheck {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int user;
                int i;
                int y=1;

                System.out.print("Enter the number ");
                user= input.nextInt();

                for (i = 2; i < user; i++) {
                    System.out.println(i);
                    if (user % i == 0) {
                        y =0;
                        break;
                    }
                }
                if (y == 1) {
                    System.out.println(" waa prime number");
                } else {
                    System.out.println(" ma han prime number!!");
            }
            }
        }
