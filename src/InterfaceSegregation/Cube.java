package InterfaceSegregation;

public class Cube implements IShapeMensuration{

    public double area(){
        return 0.0;
    }

    public double volume(){
        return 0.0;
    }
}

//  Here, we have to implement both area and volume of cube, but we don't need to have an area method here.
//  Hence, to solve this we need to have separate interfaces for area and volume.