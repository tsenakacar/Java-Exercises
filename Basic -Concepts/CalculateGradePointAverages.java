import java.util.Scanner;

public class CalculateGradePointAverages {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Your math grade;");
        int math = input.nextInt();
        System.out.println("Your physics grade;");
        int physics = input.nextInt();
        System.out.println("Your english grade;");
        int english = input.nextInt();
        System.out.println("Your history grade;");
        int history = input.nextInt();

        int average = (math + physics + english + history) / 4;

        if (average > 60) {
            System.out.println("Congratulations. You passed the class.");
        } else {
            System.out.println("You failed the class.");
            ;
        }

    }

}
