package other;

import transport.Transport;

public class Mechanic<T extends Transport> {
    private String fullName;
    private String company;
    private T transport;


    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public T getTransport() {
        return transport;
    }


    public void seviced (T transport) {
        System.out.println("Провел ТехОбслуживание");

    }

    public void fixTheTransport (T transport) {
        System.out.println("Починил машину");
    }

    @Override
    public String toString() {
        return "Механик: " + "\n" +
                "ФИО - " + fullName + "\n" +
                "Компания - " + company + "\n";

    }
}
