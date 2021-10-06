
class vehicals{
    public void move(){
        System.out.println("vehicle can moved");
    }

}
class car extends vehicals{
   
    public void move(){
        super.move();
        System.out.println("car is treaveling vehicle");
    }
}

public class override {
    public static void main(String[] args) {
  
        vehicals a=new vehicals();
        vehicals b=new car();
        a.move();
        b.move();


      
    }
}