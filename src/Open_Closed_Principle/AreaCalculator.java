package Open_Closed_Principle;

import java.awt.*;

public class AreaCalculator {
    public double area(Shape shape){
        double area = 0;
        if(shape instanceof Square){
            // Calculate Area of Square
        } else if (shape instanceof Circle) {
            // Calculate Area of Circle
        }
        return area;
    }
}


//    Here the problem with the method is that we have to add else-if block everytime at the time of extension of services.ˀ
//    1. To overcome this we need to make this class open for extension.
//    2. For this make an interface to calculate area and implement it inside the class of Shapes.
