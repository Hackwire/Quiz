import java.util.Scanner;
public class Menu
{
   public static void main(String[]args){
       System.out.println("Welcome to the maths quiz");
       System.out.println("1: Maths Quiz");
       System.out.println("2: Computing Quiz");
       System.out.println("3: New User");
       System.out.println("4: Exit");
       
       Scanner choice = new Scanner(System.in);
       String input = choice.nextLine();
       int input1 = Integer.parseInt(input);
       
       if (input1 == 1){
           MathsQuiz test = new MathsQuiz();
           test.maths();
       }else if (input1 == 2){
           Compscience test2 = new Compscience();
           test2.comp();
       }else if (input1 == 3){
       }else if (input1 == 4){
       }else {
          System.out.println("Please choose another option");
          /*Try and get the menu to start again */
       }
       
     
   }
}
