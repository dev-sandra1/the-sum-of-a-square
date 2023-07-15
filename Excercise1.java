import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner (System.in);

        float stake;

        float firstExam;

        float secondExam;

        float finalExam;

         float FinalNote;

        System.out.println("enter the note of participation: ");
        stake = enter.nextFloat();

        System.out.println("Enter the mark of the first partial exam: ");
        firstExam = enter.nextFloat();

        System.out.println("type the note of the second partial exam:");
        secondExam = enter.nextFloat();

        System.out.println("Type your final exam grade:");
        finalExam = enter.nextFloat();

        stake *= 0.10f;  /*  participacion = participacion * 0.10f; */

        firstExam *=0.25f;

        secondExam *= 0.25f;

        finalExam *= 0.40f;

        FinalNote = stake + firstExam + secondExam + finalExam;


        System.out.println("su nota final es: " + FinalNote);
    }
}