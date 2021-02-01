package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Car {

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * 
     */
    public String brand;

    /**
     * 
     */
    public String model;

    /**
     * 
     */
    public int year;

    /**
     * 
     */
    public int horsePower;

    /**
     * 
     */
    public Garage garage;

    /**
     * @return
     */
    public String getBrand() {
        // TODO implement here
        return brand;
    }

    /**
     * @param brand 
     * @return
     */
    public void setBrand(String brand) {
        // TODO implement here
    	this.brand = brand;
    }

    /**
     * @return
     */
    public String getModel() {
        // TODO implement here
        return model;
    }

    /**
     * @param model 
     * @return
     */
    public void setModel(String model) {
        // TODO implement here
    	this.model = model;
    }

    /**
     * @return
     */
    public int getYear() {
        // TODO implement here
        return year;
    }

    /**
     * @param year 
     * @return
     */
    public void setYear(int year) {
        // TODO implement here
    	this.year = year;
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