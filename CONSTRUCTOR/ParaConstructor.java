public class ParaConstructor {
    // now let's , make a contructor
    ParaConstructor(int NoOfWheels){
        int wheel=NoOfWheels;
    }
    public static void main(String[] args) {
        int car=new car(4); //here an object car is called 
        int truck=new truck(8); //here an object truck is called 
System.out.println(car.wheels);
System.out.println(truck.wheel);

        
    }
}
