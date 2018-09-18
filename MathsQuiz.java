import java.util.Scanner;
public class MathsQuiz
{
    static void maths(){
      int score = 0;
      System.out.println("Welcome to the maths quiz");
      System.out.println("Rule 1: DO NOT USE A CALCULATOR ");
      System.out.println("Rule 2: You get 5 points for each correct question ");
      System.out.println("Rule 3: You lose 3 points for each wrong qustions ");
      
      System.out.println("Q1. What is the Square root of 49");
      Scanner question1 = new Scanner(System.in);
      String ans1 = question1.nextLine();
      int ans1_1 = Integer.parseInt(ans1);
      
      
      System.out.println("Q2. How many 6's go into 120");
      Scanner question2 = new Scanner(System.in);
      String ans2 = question2.nextLine();
      int ans2_2 = Integer.parseInt(ans2);
      
      System.out.println("Q3. What is 9^3 (9 cubed)");
      Scanner question3 = new Scanner(System.in);
      String ans3 = question3.nextLine();
      int ans3_3 = Integer.parseInt(ans3);
      
      System.out.println("Q4. Which number is bigger seventy two hundred or seventy five hundred (write in numbers)");
      Scanner question4 = new Scanner(System.in);
      String ans4 = question4.nextLine();
      int ans4_4 = Integer.parseInt(ans4);
      
      System.out.println("Q5. Solve 7x=7");
      Scanner question5 = new Scanner(System.in);
      String ans5 = question5.nextLine();
      int ans5_5 = Integer.parseInt(ans5);
      
      System.out.println("Q6. Expand 20(5x+7)");
      Scanner question6 = new Scanner(System.in);
      String ans6 = question6.nextLine();
      
     
      if (ans1_1 == 7){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans2_2 == 20){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans3_3 == 729){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans4_4 == 7500){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans5_5 == 1){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans6 == "100x+140"){
          score += 5;
      }else{
          score -= 3;
      }
        
      System.out.println(score);
    }
}
