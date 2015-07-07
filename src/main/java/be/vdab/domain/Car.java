package be.vdab.domain;
import javax.persistence.*;


@Entity
public class Car {
    //Field variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;

    @ManyToOne
    private CarMake make;

    @ManyToOne
    private CarModel model;

    private String licencePlate;

    @OneToOne
    private CarOwner owner;



    //Constructor
    public Car() {
    }

    //Getters & Setters
    public CarMake getMake() {
        return make;
    }

    public void setMake(CarMake make) {
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


    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
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
