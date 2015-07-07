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


    private String licensePlate;

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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
