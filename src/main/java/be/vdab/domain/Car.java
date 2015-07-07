package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Evelyne on 06/07/15.
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;
    private String make;
    private CarModel model;
//    private CarOwner owner;




    public Car() {
    }

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




    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", id=" + id +
                ", color='" + color +"}";
    }
}
