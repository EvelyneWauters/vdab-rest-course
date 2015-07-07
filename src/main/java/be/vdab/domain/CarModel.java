package be.vdab.domain;

/**
 * Created by Evelyne on 07/07/15.
 */
public class CarModel {
    private int pk;
    private EngineType engineType;

    public CarModel(EngineType engineType, int pk) {
        this.engineType = engineType;
        this.pk = pk;
    }

    public CarModel() {
    }

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
}
