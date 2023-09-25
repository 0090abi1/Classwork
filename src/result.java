import java.util.Scanner;
public class result {

    public static void main(String[] args) {
            float input, marks = 0,total_marks=0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter no of Subjects 'Maximum four subjects' :");
            input = scan.nextInt();

            for (int i = 1; i<=input; i++){
                System.out.println("Marks obtained of Nepali, Science and Math ");
                marks = scan.nextInt();
                total_marks += marks;
            }

            float per = (total_marks / (input *100) ) * 100;
            System.out.println(per+"%");

            if(per > 80){
                System.out.println("A+");
            }
            else if (per > 65) {
                System.out.println("A");
            }
            else if (per > 50) {
                System.out.println("B");
            }
            else if (per > 40) {
                System.out.println("C");
            }
            else {
                System.out.println("Failed");
            }
    }}

