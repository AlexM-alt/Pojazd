/**
 * Class Car responsible for retrieving private values of created objects car
 */

public class Car {

    /**
     * getCar1 is a method that allows you to get the value of a private object
     * @return object data car1
     */
    public Vehicle getCar1() {
        return car1;
    }

    /**
     * getCar2 is a method that allows you to get the value of a private object
     * @return object data car2
     */
    public Vehicle getCar2() {
        return car2;
    }

    //Creating car class objects
    Vehicle car1 = new Vehicle( "Citroën CX 25 GTi Turbo", "Citroen", "car", 220 );
    Vehicle car2 = new Vehicle( "Ferrari Dino 246 GT", "Ferrari","car", 235 );
}
