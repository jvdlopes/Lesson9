
package shapeProject;


import TurtleGraphics.Pen;

public class Circle extends Shape{
    
    protected double radius, circumference;
    //protected = available here and to children only
    
    public Circle(){
        super();// up to Shape
        radius = 1;
    }
    public Circle(double x, double y, double r){
        super(x, y);
        radius = r;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side= 2 * Math.PI * radius / 120;
        //120 sided shape
        p.up();
        p.move(xPos, yPos);
        //go to edge
        p.setDirection(0);
        p.move(radius);
        p.down();
        p.setDirection(90);
        for (int i = 0; i <= 120; i++) {
            p.move(side);
            p.turn(3); // 120 * 3 = 360 degrees
        }
    }

    
    

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = factor * radius;
    }
    
    @Override
    public String toString(){
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += "perimeter: " + perimeter() + "\n";
        str += super.toString(); //get the rest from the parent
        return str;
    }
    
    @Override
    public double perimeter() {
        circumference = Math.PI * 2 * radius;
        return circumference;
    }
}
