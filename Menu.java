import java.io.IOException;
import java.util.Scanner;
public class Menu
{
   public static void main() throws IOException{
       System.out.println("Welcome to the Great quiz");
       
       User register = new User();
       register.user();
       
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
    	   System.out.println("Please choose another option");
    	   Menu2 second = new Menu2();
    	   second.menu2();
    	   
           
       }else {
          System.exit(0);
       }
       
       
   }


}
