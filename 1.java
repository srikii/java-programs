import java.util.Scanner;

class Ternary { 
    public static void main(String[] args) 
    { 
        int n1 = 200; 
        System.out.print("enter number: ");

        Scanner input = new Scanner(System.in);
        Float n2 = input.nextFloat();
        
        if(n1>=n2){
            System.out.println("your number is greater than or equal to  200" );
        } else {
            System.out.println("your number is lesser than 200");}
        }

    }