package driver;

import transport.Truck;

public class DriverCategoryC extends Driver<Truck>  {


    public DriverCategoryC(String name, String driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public final void toControlDriver(Truck truck) {
        if (isDriversLicense() == "C") {
            System.out.println("водитель " + getName() + " будет управлять автомобилем " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде");
        } else System.out.println("У " + getName() + " нет водительского удостоверения");


    }

    @Override
    public String start() {
        if (isDriversLicense() == "C") {
            return "start moving the truck";
        } else return "No driver license";

    }

    @Override
    public String stop() {
        return "stop the truck";
    }

    @Override
    public String refuelTheTransport() {
        return "refuel the truck";
    }

    @Override
    public String toString() {
        return getName() + " - Driver Category C";
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
