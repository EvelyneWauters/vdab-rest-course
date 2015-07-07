package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String city;
    private String postCode;

    //Constructor
    public MyAddress() {
    }


    /**
     * Constructor
     */
    public String getCity() {
        return city;
    }

    /**
     * Getters & Setters
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Other methods
     */
    @Override
    public String toString() {
        return "MyAddress{" +
                "city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
