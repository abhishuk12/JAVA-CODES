import java.util.Scanner;

public class Calculator {
    public static  int  main(String[] args) {
        Scanner sc=new Scanner(System.out);
         System.out.println("Enter the first number");
         int num1=sc.nextInt();
         System.out.println("Enter the second number :");
         int num2=sc.nextInt();
         System.out.println("Enter the operator :");
         sc.nextLine();
         char operator=sc.nextLine().charAt(0);
         int result=0;
         switch(operator){
             case '+':
             result =(num1+num2);
             break;
             case '-':
             result= (num1-num2);
             case '*':
             result =(num1*num2);
             case '/':
             result=(num1/num2);

         }
        
    }
    System.out.println("the value is "+ result);
    
}
