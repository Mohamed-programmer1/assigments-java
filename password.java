import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CABIRKA AD RABTO SOO GALI: ");
        int input = scanner.nextInt();
        String upper_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_letter = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "@#$&%^&*_.?/!";
        String all = upper_letter + lower_letter + digits+symbols;
        String paswords= "";
        for (int i = 0; i < input; i++)
        {
            int x = (int)(Math.random() * all.length());
            paswords+= all.charAt(x);
        }

        System.out.println(" PASSWORDKAAGA CUSUB WAA:  " +paswords);


    }
}