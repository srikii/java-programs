
import java.util.Scanner;
public class Ten{
public static void main(String[] ars)
{
int num=0;
int sum=0;
Scanner input = new Scanner(System.in);
System.out.print("Enter Numbers ");
while(true)
{
    num=input.nextInt(); //Read number
    if(num<0)
    break;
    sum +=num;
}
        System.out.println( "Sum is : " +sum);
}
}