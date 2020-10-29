
package shapeProject;


import TurtleGraphics.Pen;

public class Triangle extends Shape{
    private double xPos1, yPos1, xPos2, yPos2, xPos3,yPos3;
    
    public Triangle(){
        super();
        
    }
    public Triangle(double x, double y, double x2, double y2, double x3, double y3){
        super(x, y); //calls Shape (parent) constructor
        xPos2 = x2;
        yPos2 = y2;
        xPos3 = x3;
        yPos3 = y3;
    }
    
     @Override
    public double area() {
       return Math.abs((xPos1*yPos2-xPos2*yPos1) + (xPos2*yPos3-xPos3*yPos2) + (xPos3*yPos1-xPos1*yPos3));
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.setDirection(0); //points to the right
        p.move(xPos3,yPos3);
        //p.turn(135); //points left (at an angle upwards)
        p.move(xPos2,yPos2);
        //p.turn(90);
        p.move(xPos, yPos);
    }

    

    @Override
    public void stretchBy(double factor) {
        xPos2  = (xPos2 - xPos) * factor + xPos;
        yPos2  = (yPos2 - yPos) * factor + yPos;
        xPos3  = (xPos3 - xPos) * factor + xPos;
        yPos3  = (yPos3 - yPos) * factor + yPos;
        
    }
    
    @Override
    public String toString(){
        String str = "RECTANGLE\n";
        str += "Width x Height: "; //+ width + " x " + height + "\n";
        str += super.toString();
        str += "\nperimeter: "; //+ ((2 * width) + (2 * height));
        return str;
    }
    
    @Override
    public double perimeter() {
        return Math.sqrt((xPos-xPos2) * (xPos-xPos2) + (yPos-yPos) * (yPos-yPos));
    }
    
    public void move(double xLoc, double yLoc){
        double xc = xLoc - xPos;
        double yc = yLoc - yPos;
        xPos = xLoc;
        yPos  = yLoc;
        xPos2 += xc;
        yPos2 += yc;
        xPos3 += xc;
        yPos3 += yc;
    }
    
}
