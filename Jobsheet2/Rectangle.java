package Jobsheet2;

public class Rectangle {
    public int length, width;

    
    public int getArea(){
        return length*width;
    }

    public int getCircumference(){
        return (length*2)+(width*2);
    }
    public void displayInfo(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+ width);
        System.out.println("Area of the square: "+getArea());
        System.out.println("Circumference: "+getCircumference());
    }

}
