
package shapeProject;

import TurtleGraphics.Pen;

public class Rect extends Shape{
    private double width, height, perimeter;
    
    public Rect(){
        super();
        width = 1;
        height = 1;
    }
    public Rect(double x, double y, double w, double h){
        super(x, y); //calls Shape (parent) constructor
        width = w;
        height = h;
    }
    
     @Override
    public double area() {
       return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.setDirection(0); //points to the right
        p.move(width);
        p.turn(-90); //right (down)
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    

    @Override
    public void stretchBy(double factor) {
        width  *= factor;
        height *= factor;
    }
    
    @Override
    public String toString(){
        String str = "RECTANGLE\n";
        str += "Width x Height: " + width + " x " + height + "\n";
        str += "perimeter: " + perimeter() + "\n";
        str += super.toString();
        return str;
    }
    
    @Override
    public double perimeter() {
        perimeter = (2 * width) + (2 * height);
        return perimeter;
    }
}
