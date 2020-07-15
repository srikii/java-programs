import java.util.Scanner;

public class Four {
    public static void main(String args[]){    
    
        System.out.println("enter total amount");
         Scanner input = new Scanner(System.in);
         Float total = input.nextFloat();

         System.out.println("enter tip percent");
         Float tip = input.nextFloat();
         
         scanner.close();

        float tipp=((tip*total)/100);
        
        System.out.println("the total tip is "+tipp);
}}