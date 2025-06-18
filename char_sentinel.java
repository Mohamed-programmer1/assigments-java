import java.util.Scanner;
public class char_sentinel {
    public static void main(String[] args) {
        String stops = "n";
        int total_sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("SOO GALI NUMBER !! TAABO  N SAAD UGA LAABATID : ");


        while (true) {
            System.out.println("SOO GALI NUMBER  :");
            String stop = input.nextLine();
            char n = stop.charAt(0);
            if (n == 'n' || n=='N') {
                break;
            }
            else {
                int number = Integer.parseInt(stop);
                total_sum += number;
            }

        }
        System.out.println("ISKU DARKU WAA : " +total_sum);}
}