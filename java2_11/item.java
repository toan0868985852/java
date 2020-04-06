package java2_11;

public class item {
    private int id;
    private int qty;
    private float price;

    public item(int id) {
        this.id = id;
    }

    public item(int id, int qty, float price){
        this.id = id;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "" +
                "id = " + id +
                ", số lượng = " + qty +
                ", giá sách = " + price + "\n";
    }
}
