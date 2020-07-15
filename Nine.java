import java.util.Scanner;
  
public class Eight 
{ 
    public static void printTriagle(int n) 
    {
        for (int i=1; i<n; i++) 
        { 
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            } 
   
            for (int j=1; j<=i; j++ ) 
            { 
                System.out.print(i+" "); 
            } 
            System.out.println(); 
        } 
    } 
          public static void main(String args[]) 
    { 
        System.out.println("enter number of lines in triangle");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printTriagle(n+1); 
    } 
} 