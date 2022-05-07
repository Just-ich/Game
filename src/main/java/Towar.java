public class Towar {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    private String name;

    public Towar(String name, int price, int lvl) {
        this.name = name;
        this.price = price;
        this.lvl = lvl;
    }

    private int price;
    private int lvl;
}
