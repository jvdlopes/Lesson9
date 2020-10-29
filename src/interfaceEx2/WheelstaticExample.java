
package interfaceEx2;


public class WheelstaticExample {

    
    public static void main(String[] args) {
        Wheel x, y, z;
        x = new Wheel();
        y = new Wheel(10,10,50,5);
        z = new Wheel(10,10,50,5);
        System.out.println(x);
        System.out.println("\n" + y);
        System.out.println("\n" + z);
        System.out.println("------------");
        System.out.println("Wheels made:" + Wheel.getWheelCount());
        System.out.println("Average size: " + Wheel.getAvgSize());
                
    }
    
}
