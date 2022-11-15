import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import other.Mechanic;
import other.Shop;
import other.Sponsor;
import transport.*;

public class Main {
    public static void main(String[] args) throws DiagnosticException {
        PassengerCar audi = new PassengerCar("AUDI", "A4", 2.0, "Седан", true);
        PassengerCar bmw = new PassengerCar("BMW", "5 series", 2.0, "Седан", false);
        PassengerCar mb = new PassengerCar("Mercedes-Benz", "E200", 2.0, "Универсал", true);

        Truck volvo = new Truck("Volvo", "FH", 12.8, "с полной массой до 3,5 тонн", true);
        Truck scania = new Truck("Scania", "P-series", 12.7, "с полной массой свыше 3,5 до 12 тонн", true);
        Truck daf = new Truck("DAF", "XF", 12.0, "с полной массой свыше 3,5 до 12", false);


        Bus zhongTong = new Bus("Zhong Tong", "Fasion", 7.5, "40-50 мест");
        Bus volgabus = new Bus("Volgabus", "Ситирим", 6.5, "40-50 мест");
        Bus higer = new Bus("Higer", "KLQ 6928", 6.7, "40 мест");

//        ArrayList<Transport> transport = new ArrayList<>();
//        transport.add(audi);
//        transport.add(bmw);
//        transport.add(mb);
//        transport.add(volvo);
//        transport.add(scania);
//        transport.add(daf);
//        transport.add(zhongTong);
//        transport.add(volgabus);
//        transport.add(higer);

//        System.out.println(transport.toString());

        DriverCategoryB smith = new DriverCategoryB("Smith", "B", 10);
        DriverCategoryC alex = new DriverCategoryC("Alex", "C", 5);
        DriverCategoryD sam = new DriverCategoryD("Sam", "D", 9);
        DriverCategoryD demis = new DriverCategoryD("Demis", "D", 0);
//        smith.toControlDriver(audi);
//        alex.toControlDriver(volvo);
//        sam.toControlDriver(higer);
//        demis.toControlDriver(higer);

        Sponsor gazprom = new Sponsor("Газпром", 10000);
        Sponsor ip = new Sponsor("ИП Иванов Иван", 25000);
        Sponsor motul = new Sponsor("Motul", 15000);
//        audi.getSponsor().add(gazprom);
//        bmw.getSponsor().add(ip);


        Mechanic <Transport> dmitriy = new Mechanic<>("Дмитрий", "Делюкс");
        Mechanic<Bus> oleg = new Mechanic<>("Олег", "ИП");
        Mechanic<PassengerCar> sergey = new Mechanic<>("Сергей", "ИП");
        Mechanic<Bus> artem = new Mechanic<>("Артем", "самозанятый");



        Shop.addPersonAtQueue("A");
        Shop.addPersonAtQueue("B");
        Shop.addPersonAtQueue("C");
        Shop.addPersonAtQueue("D");
        Shop.addPersonAtQueue("E");
        Shop.addPersonAtQueue("F");
        Shop.addPersonAtQueue("G");
        Shop.addPersonAtQueue("Р");
        Shop.addPersonAtQueue("Ш");
        Shop.addPersonAtQueue("О");
        Shop.addPersonAtQueue("Д");
        System.out.println(Shop.queue1.toString());
        System.out.println(Shop.queue2.toString());



//        dmitriy.seviced(higer);
//        oleg.fixTheTransport(higer);
//
//        audi.addMechanic(sergey);
//        System.out.println(audi);
//
//        audi.addDriver(smith);
//        audi.addDriver(smith);
//        System.out.println(audi);

//        ServiceStation<Transport> serviceStation = new ServiceStation<>("TTS");
////
//        serviceStation.addQueue(audi);
//        serviceStation.addQueue(bmw);
//        serviceStation.addQueue(mb);
//        System.out.println(serviceStation);
//        serviceStation.goToService();
//        System.out.println(serviceStation);


//        System.out.println(smith.refuelTheTransport());
//        System.out.println(sam);
//        System.out.println(sam.stop());
//        System.out.println(sam.start());
//        System.out.println(sam.refuelTheTransport());
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(daf);
//        System.out.println(scania);
//        System.out.println(volgabus);
//        System.out.println(higer);
//        audi.runDiagnostics();
//        bmw.runDiagnostics();
//        higer.runDiagnostics();





    }
}