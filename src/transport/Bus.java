package transport;

import other.Mechanic;

public class Bus extends Transport implements Rival {
    public enum Capacity {
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 20 мест"),
        AVERAGE("40-50 мест"),
        LARGE("60-80 мест"),
        ESPECIALLY_LARGE("100-120 мест");

        private String capacity;

        Capacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }


        public static Capacity findCapacity(String capacity) {
            for (Capacity capacity1 : values()) {
                if (capacity1.capacity.equals(capacity)) return capacity1;

            }
            return null;
        }

        public static String identifyCapacity(Bus bus) {
            return bus.capacity != null ? bus.capacity.capacity : "нет информации";

        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, String capacity) {
        super(brand, model, engineVolume);
        this.capacity = Capacity.findCapacity(capacity);
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void finish() {
        System.out.println("Остановиться");
    }


    @Override
    public String pitSop() {
        return "грузовому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга автобуса";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Диагностика не требуется");

    }

    public void addMechanic(Mechanic<Bus> mechanic) {
        if (!getMechanics().contains(mechanic)) getMechanics().add(mechanic);
    }


    @Override
    public String toString() {
        return super.toString() + "Пассажировместимость - " + Capacity.identifyCapacity(this) + "\n";
    }

}
