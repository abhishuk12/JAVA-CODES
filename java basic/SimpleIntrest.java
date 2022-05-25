import java.util.Scanner;
public class SimpleIntrest {
    public static void main (String [] args ){
Scanner sc =new Scanner(System.in);
System.out.println("enter the value of principal ");
int principal=sc.nextInt();
System.out.println("enter the value rate  ");
float rate=sc.nextFloat();
System.out.println("enter the value of time ");
int time =sc.nextInt();
float simpleIntrest=(principal*rate*time)/100;
System.out.println("the simple intrest is "+simpleIntrest);
    }
    
}
