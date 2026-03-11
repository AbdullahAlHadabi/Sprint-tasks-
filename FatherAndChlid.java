public class FatherAndChlid {
    public static void main(String[] args){

        Car c = new Car();
        c.move();
    }
}

class v{
    void move (){
        System.out.println("car is moving");
    }
}
class Car extends v{

}