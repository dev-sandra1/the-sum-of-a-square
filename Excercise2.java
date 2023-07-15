import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        
         Scanner enter = new Scanner (System.in);

          float num1;
          float num2;
           
          System.out.println("escriba el primer numero: ");
          num1 = enter.nextFloat();
         

          System.out.println("escribra el segundo numero:");
          num2 = enter.nextFloat();

          double sumSquares = (Math.pow(num1, 2) + Math.pow(num2, 2)) ;
          
         double result =( num1 * num2) * 2 ;

          double total = result + sumSquares ;

           System.out.println("tu resultado es:" + total);
         

        /*  float num1 = 4f; 
         float num2 = 6f; 

         //double total = Math.pow( (num1 + num2), 2);

         
         double total = (Math.pow(num1, 2) + Math.pow(num2, 2)) ;

         double resultado =( num1 * num2) * 2;

         double fin = total + resultado;

         System.out.println(fin);

         /* double resultado = Math.pow((double)(num1 + num2), 2); */
 
          

        }
}
