package be.vdab.domain;

import javax.persistence.*;

/**
 * Created by Evelyne on 07/07/15.
 */

@Entity
public class CarMake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private MyAddress address;

    @ManyToOne
    private CarModel model;

    //Constructor
    public CarMake() {
    }

    //Getters & Setters
    public MyAddress getAddress() {
        return address;
    }

    public void setAddress(MyAddress address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    //Other Methods
    @Override
    public String toString() {
        return "CarMake{" +
                "address=" + address +
                ", id=" + id +
                '}';
    }
}
