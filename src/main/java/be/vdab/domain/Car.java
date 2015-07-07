package be.vdab.domain;

import javax.persistence.*;

/**
 * Created by Evelyne on 06/07/15.
 */

@Entity
public class Car {
    //Field variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;

    @OneToOne
    private CarMake make;

    @OneToOne
    private CarModel model;

//    private CarOwner owner;



    //Constructor
    public Car() {
    }

    //Getters & Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }



    //Other methods & Overrides
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", id=" + id +
                ", color='" + color +"}";
    }
}
