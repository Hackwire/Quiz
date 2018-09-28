import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class User
{
    static void user() throws IOException {
    	System.out.println("What is your name? ");
    	Scanner name = new Scanner(System.in);
    	String name1 = name.nextLine();
    	
    	System.out.println("What is your age?");
    	Scanner age = new Scanner(System.in);
    	String age1 = age.nextLine();
    	
    
    	
    	FileWriter User_info = new FileWriter("userinfo.txt");
    	
    	User_info.write(name1);
    	User_info.append(age1);
    	
    	
    	User_info.close();
        
         
    
    
    }
}
	
