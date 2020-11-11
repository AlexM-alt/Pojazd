import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The program checks the fastest vehicle, based on the vehicle type selected by the user.
 * @author Aleksander Micyk
 * @version 1.0
 */

/**
 *
 */
public class Menu {

    private final static Logger logger = Logger.getLogger( Window.class.getName() );
    private static String userChoose;


    //Create a new object
    Ship ship = new Ship();
    Plane plane = new Plane();
    Car car = new Car();
    Bicycle bicycle = new Bicycle();


    /**
     *Method that checks the choice of user options.
     *
     */
    public  void menuLogic() {

        List<Vehicle> vehicleList = List.of(ship.getShip1(),ship.getShip2(),plane.getPlane1(),plane.getPlane2(),bicycle.getBicycle1(),bicycle.getBicycle2(),car.getCar1(),car.getCar2());

        Stream<Vehicle> filtrStream = vehicleList.stream().filter( vehicle -> vehicle.getType().equals( userChoose.toLowerCase().replace( " ", "" ) ) );

        List<Vehicle> vehicleListF = filtrStream.collect( Collectors.toList());


        //when users write ALL then
        if(userChoose.toUpperCase().trim().replace( " ","" ).equals( "ALL" )){
            vehicleListF= new ArrayList(vehicleList);
        }

        //when users write exit then program exits
        else if(userChoose.toUpperCase().trim().replace( " ","" ).equals( "EXIT" )){
            System.exit( 0 );
        }


        if(vehicleListF.size() > 0){
            vehicleListF.sort( Comparator.comparing( Vehicle::getSpeed ).reversed() );

            Vehicle vehicleWrite = vehicleListF.stream().findFirst().orElseThrow(  );
            logger.info( "\n\nPojazd  " + vehicleWrite.getName() + " producenta " + vehicleWrite.getProducer() + " jest najszybszy. \nJego maksymalna prędkość wynosi: " + vehicleWrite.getSpeed());
            menuShow();
            menuLogic();

        }

        //wrong option selected by the user
        else{
            logger.info( "\nPodano nieprawidłową opcję." );
            menuShow();
            menuLogic();
        }
    }

    /**
     * Method that displays a selection menu to the user
     */
    public static void menuShow(){

        logger.info( " \nWrite your option:  \nCAR  \nSHIP  \nPLANE  \nBICYCLE \nAll \nEXIT"  );
        Scanner scanner = new Scanner( System.in );
        userChoose = scanner.nextLine();

    }

    //Main method calls the display methods and operation method
    public static void main(String[] args) {

        menuShow();
        Menu menu = new Menu();
        menu.menuLogic();

    }


}
