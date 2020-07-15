import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        System.out.println("enter year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        scanner.close();
        
        boolean leap = false;
        
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}