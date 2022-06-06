public class MethodIntroduction {
    public static void main(String [] args) {
    int number1=24;
    int numer2=88;
    int result=maxOf(int number1,int numer2)  //here method is called 
    System.out.println(result);
    sayHi();  
        
    }
    static int maxOf(int a,int b){
        if(a>b){
            return a;

        }
        else{
            return b;
        }
    }
    static void sayHi(){
        System.out.println("Eat , sleep , code , repeat ");
    }
}
