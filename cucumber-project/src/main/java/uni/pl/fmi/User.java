package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;



    /**
     * 
     */
    private Set<Garage> garages = new HashSet<>();

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        // TODO implement here
    	this.username=username;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        // TODO implement here
    	this.password=password;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        // TODO implement here
    	this.email = email;
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        // TODO implement here
    	this.firstName=firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        // TODO implement here
    	this.lastName=lastName;
    }

    /**
     * @return
     */
    public Set<Garage> getGarages() {
        // TODO implement here
        return garages;
    }

    /**
     * @param garage 
     * @return
     */
    public void setGarages(Set<Garage> garages) {
        // TODO implement here
    	this.garages=garages;
    }

    /**
     * @param garage 
     * @return
     */
    public void addGarage(Garage garage) {
        // TODO implement here
    	this.garages.add(garage);
    }

}