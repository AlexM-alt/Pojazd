/**
 * Class Vehicle responsible for getting private values
 */

public class Vehicle {

    private String name;
    private int speed;
    private String producer;
    private String type;

    /**
     *Constructor class Vehicle
     * @param name assigning a vehicle name
     * @param producer assigning a vehicle producer
     * @param type assigning a vehicle type
     * @param speed assigning a vehicle speed
     */
    public Vehicle(String name, String producer,String type, int speed){
        this.name = name;
        this.producer = producer;
        this.type = type;
        this.speed = speed;
    }

    /**
     * getSpeed is a method that allows you to get the value of a private field speed
     * @return vehicle max speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * getName is a method that allows you to get the value of a private field name
     * @return name vehicle
     */
    public String getName() {
        return name;
    }


    /**
     * getProducer is a method that allows you to get the value of a private field producer
     * @return producer name
     */
    public String getProducer() {
        return producer;
    }


    /**
     * getType is a method that allows you to get the value of a private field type
     * @return type vehicle
     */
    public String getType() {
        return type;
    }

}
