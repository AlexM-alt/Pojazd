/**
 * Class Plane responsible for retrieving private values of created objects plane
 */

public class Plane {

    /**
     * getPlane1 is a method that allows you to get the value of a private object
     * @return object data plane1
     */
    public Vehicle getPlane1() {
        return plane1;
    }

    /**
     * getPlane2 is a method that allows you to get the value of a private object
     * @return object data plane2
     */
    public Vehicle getPlane2() {
        return plane2;
    }


    //Creating plane class objects
    Vehicle plane1 = new Vehicle( "Boeing 747", "Boeing Commercial Airplanes", "plane", 800 );
    Vehicle plane2 = new Vehicle( "McDonnell Douglas MD-11", "Boeing Commercial Airplanes","plane", 700 );
}
