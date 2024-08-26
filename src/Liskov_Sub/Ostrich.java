package Liskov_Sub;

public class Ostrich extends Bird{
    @Override
    public void fly(){ /* Implementation of the abstract method. */ }
}


//  Here the extension of Bird superclass hinders the ability of Ostrich class.
//  Since, the functions of ostrich class doesn't match with method fly, but it still inherits it.
//  This is a bad practice of having an unnecessary method which is extending towards this subclass.
//  To overcome this, you need the separate the class of FLying and Non-Flying Bird.