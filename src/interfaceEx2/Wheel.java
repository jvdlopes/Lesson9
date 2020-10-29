
package interfaceEx2;

import TurtleGraphics.Pen;


public class Wheel extends Circle{
    //Wheel inherits everything from circle
    //except constructor
    private int spokes; //wheel has 4 properties
    private static int wheelCount=0;
    private static double avgSize;
    
    public Wheel(){
        xPos = 0;
        yPos = 0;
        radius = 0;
        spokes = 3;
    }
    
    public Wheel(double x, double y, double r, int s){
        super(x,y,r); //super = call parent constructor
        spokes = s;
        wheelCount++;
        avgSize += area();
    }
    
    public static int getWheelCount(){
        return wheelCount;
    }
    public static double getAvgSize(){
        return (double)avgSize / wheelCount;
    }
    
    public void draw(Pen p){
        //call parent draw to get circle
        super.draw(p);
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i * 360 / spokes);
            p.move(radius);
        }
    }
    
    //exclusive method
    public void setSpokes(int s){
        spokes = s;
    }
    
    //over-ride the toString Method()
    public String toString(){
        String str = "WHEEL\n";
        str += "Radius: " + radius + "\n";
        str += ("(x,y) = (" + xPos + ", " + yPos + ")");
        str += "Number of spokes: " + spokes + "\n";
        str += "Area: " + area();
        return str;
    }
}
