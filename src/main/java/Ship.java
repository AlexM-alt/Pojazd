/**
 * Class Ship responsible for retrieving private values of created objects ship
 */

public class Ship {

    /**
     * getShip1 is a method that allows you to get the value of a private object
     * @return object data ship1
     */
    public Vehicle getShip1() {
        return ship1;
    }

    /**
     * getShip2 is a method that allows you to get the value of a private object
     * @return object data ship2
     */
    public Vehicle getShip2() {
        return ship2;
    }

     //Creating ship class objects
    Vehicle ship1 = new Vehicle( "Titun Uranus", "Titan Uranus Hoax", "ship",78 );
    Vehicle ship2 = new Vehicle( "LPD-Castilla", "Spanish ship Castilla","Ship", 107 );
}
