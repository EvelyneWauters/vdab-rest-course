package be.vdab.domain;

/**
 * Created by Evelyne on 07/07/15.
 */
public class CarOwner {

    private Integer id;
    private String firstName;
    private String lastName;
    private MyAddress address;



    //Constructor
    public CarOwner() {
    }

    //Getters & Setters
    public MyAddress getAddress() {
        return address;
    }

    public void setAddress(MyAddress address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
