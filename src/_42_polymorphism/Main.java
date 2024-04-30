package _42_polymorphism;

import _38_access_modifiers.package1.B;

public class Main {
    public static void main(String[] args) {
        //polymorphism =    greek word for poly-"many", morph-"from
        //                  The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        //Car[] racers = {car, bicycle, boat};      // error
        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle i : racers){
            i.go();
        }

    }
}
