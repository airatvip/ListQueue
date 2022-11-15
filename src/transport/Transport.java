package transport;

import driver.Driver;
import other.Mechanic;
import other.Sponsor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private ArrayList<Driver> drivers = new ArrayList<>();

    private LinkedList<Sponsor> sponsor = new LinkedList<>();

    private ArrayList<Mechanic> mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "no info";
        } else this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "no info";
        } else this.model = model;

        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else this.engineVolume = engineVolume;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(String model) {
        this.model = model;
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public LinkedList<Sponsor> getSponsor() {
        return sponsor;
    }

    public void setSponsor(LinkedList<Sponsor> sponsor) {
        this.sponsor = sponsor;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public abstract void start();

    public abstract void finish();

    protected abstract void runDiagnostics() throws Exception;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Автомобиль: \n" +
                "Марка - " + brand + "\n" +
                "Модель - " + model + "\n" +
                "Объем двигателя - " + engineVolume + "\n" + getDrivers() + "\n" +
                getMechanics().toString() + "\n" + getSponsor();
    }
}



