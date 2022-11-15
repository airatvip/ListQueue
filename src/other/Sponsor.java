package other;

public class Sponsor {
    private String name;
    private int cash;

    public Sponsor(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "Спонсор" + "\n" +
                "Фирма - " + name  + "\n" +
                "Спонсирование - " + cash;
    }
}
