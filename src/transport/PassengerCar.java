package transport;

import driver.DriverCategoryB;
import other.Mechanic;

public class PassengerCar extends Transport implements Rival {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        SW("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;

        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public static BodyType findByBodyType(String bodyType) {
            for (BodyType type : values()) {
                if (type.bodyType.equals(bodyType)) return type;

            }
            return null;
        }

        public static String identifyBodyType(PassengerCar passengerCar) {
            return passengerCar.bodyType != null ? passengerCar.bodyType.bodyType : "нет информации";

        }


    }


    private BodyType bodyType;
    private boolean service;

    public PassengerCar(String brand, String model, double engineVolume, String bodyType, boolean service) {
        super(brand, model, engineVolume);
        this.bodyType = BodyType.findByBodyType(bodyType);
        this.service = service;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void finish() {
        System.out.println("Закончить движение");
    }


    @Override
    public String pitSop() {
        return "легковому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга легкового автомобиля";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public void runDiagnostics() throws DiagnosticException {
        if (service == true)
            System.out.println("ran a diagnostic");
        else throw new DiagnosticException("Диагностика невозможна " + getBrand() + " " + getModel());

    }

    public void addMechanic(Mechanic<PassengerCar> mechanic) {
        if (!getMechanics().contains(mechanic)) getMechanics().add(mechanic);
    }

    public void addDriver(DriverCategoryB driver) {
        if (!getDrivers().contains(driver)) getDrivers().add(driver);

    }


    @Override
    public String toString() {
        return super.toString() + "Кузов - " + BodyType.identifyBodyType(this) + "\n";

    }
}
