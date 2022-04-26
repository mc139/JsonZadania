package cars.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Car {

    private String brand;
    private String model;
    private double engineCapacity;
    private boolean hasTurbo;
    private List<Addon> addons;
    public static List<Car> carExtention = new ArrayList<>();

    public Car() {
        carExtention.add(this);
    }

    public Car(String brand, String model, double engineCapacity, boolean hasTurbo, List<Addon> addons) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.hasTurbo = hasTurbo;
        this.addons = addons;
        carExtention.add(this);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public boolean getHasTurbo() {
        return hasTurbo;
    }

    public List<Addon> getAddons() {
        return addons;
    }
}
