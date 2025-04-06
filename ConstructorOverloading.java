class Room{
    float length;
    float breadth;
    Room(float x,float y){
        length=x;
        breadth=y;
    }
    Room(float x){
        length=breadth=x;
    }
    int area(){
        return (int)(length * breadth);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Room room1=new Room(25.0f,15.0f);
        Room room2=new Room(20.0f);
        System.out.println("Area of room1: " + room1.area());
        System.out.println("Area of room2: " + room2.area());
    }
}
