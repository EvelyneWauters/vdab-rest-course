package be.vdab.domain;

import javax.persistence.*;

@Entity
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int pk;

    @Enumerated(EnumType.STRING)
    private EngineType engineType;

    //Constructors
    public CarModel(EngineType engineType, int pk) {
        this.engineType = engineType;
        this.pk = pk;
    }

    public CarModel() {
    }

    //Getters & Setters
    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Other methods


    @Override
    public String toString() {
        return "CarModel{" +
                "engineType=" + engineType +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", pk=" + pk +
                '}';
    }
}
