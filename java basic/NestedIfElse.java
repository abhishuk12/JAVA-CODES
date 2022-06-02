public class NestedIfElse { 
    public static void main(String [] args){
        int num1=734;
        int num2=342;
        int num3=891;
        if(num1>num2){
            if(num1>num3){
                System.out.println("num one is greater ");
            }
            else{
                System.out.println("num 3 is greater ");

            }
            else{
                if(num2>num3){
                System.out.println("num 2 is greater ");
            }
            else{
                System.out.println("num three is greater ");
            }
        }
    }
}
