import java.util.Scanner;
public class Compscience
{
    void comp(){
      int score = 0;
      System.out.println("Welcome to the Computer Science quiz");
      System.out.println("Rule 1: You get 5 points for a correct answer ");
      System.out.println("Rule 2: You lose 3 points for a incorrect answer ");
      
      System.out.println("Q1. What does RAM stand for?");
      Scanner question1 = new Scanner(System.in);
      String ans1 = question1.nextLine();
      String ans1_1;
      ans1_1 = ans1.toLowerCase();
      
      System.out.println("Q2. What does CPU stand for?");
      Scanner question2 = new Scanner(System.in);
      String ans2 = question2.nextLine();
      String ans2_2;
      ans2_2 = ans2.toLowerCase();
           
      System.out.println("Q3. What does GPU stand for?");
      Scanner question3 = new Scanner(System.in);
      String ans3 = question3.nextLine();
      String ans3_3;
      ans3_3 = ans3.toLowerCase();

      System.out.println("Q4. What componenet does you CPU and RAM plug into ");
      Scanner question4 = new Scanner(System.in);
      String ans4 = question4.nextLine();
      String ans4_4;
      ans4_4 = ans4.toLowerCase();
      
      System.out.println("Q5. What does HDD stand for ");
      Scanner question5 = new Scanner(System.in);
      String ans5 = question5.nextLine();
      String ans5_5;
      ans5_5 = ans5.toLowerCase();
      
      System.out.println("Q6. What does SSD stand for ");
      Scanner question6 = new Scanner(System.in);
      String ans6 = question6.nextLine();
      String ans6_6;
      ans6_6 = ans6.toLowerCase();
            
     
      if (ans1 == "random access memory"){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans2 == "central processing unit"){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans3 == "graphical processing unit"){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans4 == "motherboard" ){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans5 == "hard disk drive"){
          score += 5;
      }else{
          score -= 3;
      }
      if (ans6 == "solid state drive"){
          score += 5;
      }else{
          score -= 3;
      }
        
      
    }
}
