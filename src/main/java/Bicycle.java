/**
 * Class Bicycle responsible for retrieving private values of created objects bicycle
 */

public class Bicycle {

    /**
     * getBicycle1 is a method that allows you to get the value of a private object
     * @return object data bicycle1
     */
    public Vehicle getBicycle1() {
        return bicycle1;
    }

    /**
     * getBicycle2 is a method that allows you to get the value of a private object
     * @return object data bicycle2
     */
    public Vehicle getBicycle2() {
        return bicycle2;
    }

    //Creating bicycle class objects
    Vehicle bicycle1 = new Vehicle( "Honda Activa 6G", "Honda","bicycle", 30 );
    Vehicle bicycle2 = new Vehicle( "Yamaha YZF R15 V3", "Yamaha","bicycle", 27 );
}
