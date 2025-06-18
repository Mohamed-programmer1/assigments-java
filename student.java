import java.util.Scanner;

public class student {
    static String[] studentNames = new String[3];
    static int[] studentGrades = new int[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner stuinput = new Scanner(System.in);
        Scanner searchstudent = new Scanner(System.in);
        Scanner showreport = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("1. kuso dar arday");
            System.out.println("2. raadi arday");
            System.out.println("3. itus warbixin");
            System.out.println("4. ka noqo! ");
            int userinput = input.nextInt();
            switch (userinput) {
                case 1:
                    Addstudent(stuinput);
                    break;
                case 2:
                    Searchingstu(searchstudent);
                    break;
                case 3:
                    Reports(showreport);
                    break;
                case 4:
                    System.out.println("you exit the system");
                    break;
                default:
                    System.out.println(" soo gali 1 ilaa 3 ama taabo 4 to saad uga laabtid");
                    continue;
            }
            if (userinput == 4){
                break;
            }
        }

    }
    //student method
    public static void Addstudent(Scanner stuinput){

        System.out.println("gali magaca ardayga ! ");
        String name = stuinput.nextLine();

        System.out.println("gali natiijada ardayga! ");
        int Grade = stuinput.nextInt();
        stuinput.nextLine();

        if (Grade < 0 || name.length() < 3){
            System.out.println("xogta so galisay wax jiro mahan! ");
        }
        else {
            studentNames[studentCount] = name;
            studentGrades[studentCount] = Grade;
            studentCount++;

            System.out.println("waxad diwan galisay ardayga cusub!! " + name);
        }

    }

    //search student
    public static void Searchingstu(Scanner searchstudent){

        System.out.println("raadi arday ");
        String searstudent = searchstudent.nextLine();

        for (int i = 0 ; i < studentCount ; i++){
            if (studentNames[i].equalsIgnoreCase(searstudent)){
                System.out.println("waxaad raadisay" + studentNames[i] + " natiijadiisa " + studentGrades[i]);
                break;
            }
            System.out.println("lama helin ardayga raadisay");
            break;
        }

    }

    //show report

    public static void Reports(Scanner showreport){

        int highest;
        int lowest ;


        int sum = 0;
        highest = studentGrades[0];
        lowest = studentGrades[0];

        for (int i = 0 ; i < studentCount; i++){

            if (studentCount < 3){
                System.out.println("kuso dar 3 arday kow");
                return;
            }
            else {
                int avgrade = studentGrades[i];
                sum += avgrade;

                if (avgrade > highest)
                    highest = avgrade;
                if (avgrade < lowest)
                    lowest = avgrade;

            }
        }
        double result = (double) sum / studentCount;

        System.out.println("celcelisku waa: " + result);
        System.out.println("ugu badan: " + highest);
        System.out.println("ugu yar: " + lowest);

    }
}