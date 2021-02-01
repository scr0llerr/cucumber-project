package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Garage {

    /**
     * Default constructor
     */
    public Garage() {
    }

    /**
     * 
     */
    public int numberOfCars;

    /**
     * 
     */
    public int totalPrice;

    /**
     * 
     */
    public String location;

    /**
     * 
     */
    public int horsePower;

    /**
     * 
     */
    public User user;

    /**
     * 
     */
    public Set<Car> cars;

    /**
     * @return
     */
    public int getNumberOfCars() {
        // TODO implement here
        return numberOfCars;
    }

    /**
     * @param numberOfCars 
     * @return
     */
    public void setNumberOfCars(int numberOfCars) {
        // TODO implement here
    	this.numberOfCars = numberOfCars;
    }

    /**
     * @return
     */
    public int getTotalPrice() {
        // TODO implement here
        return totalPrice;
    }

    /**
     * @param totalPrice 
     * @return
     */
    public void setTotalPrice(int totalPrice) {
        // TODO implement here
    	this.totalPrice = totalPrice;
    }

    /**
     * @return
     */
    public String getLocation() {
        // TODO implement here
        return location;
    }

    /**
     * @param location 
     * @return
     */
    public void setLocation(String location) {
        // TODO implement here
    	this.location = location;
    }

    /**
     * @return
     */
    public int getHorsePower() {
        // TODO implement here
        return horsePower;
    }

    /**
     * @param horsePower 
     * @return
     */
    public void setHorsePower(int horsePower) {
        // TODO implement here
    	this.horsePower = horsePower;
    }

}