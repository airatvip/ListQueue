package driver;

import transport.Bus;

public class DriverCategoryD extends Driver<Bus>  {

    public DriverCategoryD(String name, String driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public final void toControlDriver(Bus bus) {
        if (isDriversLicense() == "D") {
            System.out.println("водитель " + getName() + " будет управлять автомобилем " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде");
        } else System.out.println("У " + getName() + " нет водительского удостоверения");


    }

    @Override
    public String start() {
        if (isDriversLicense() == "D") {
            return "start moving the bus";
        } else return "No driver license";

    }

    @Override
    public String stop() {
        return "stop the bus";
    }

    @Override
    public String refuelTheTransport() {
        return "refuel the bus";
    }

    @Override
    public String toString() {
        return getName() + " - Driver Category D";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
