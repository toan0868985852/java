package ebookshop2;

public class ebookshopsach {
   private int id;
   private String author;
   private String title;
   private float price;
   private int qty;

   public ebookshopsach(int id){
       this.id = id;
   }

   public ebookshopsach(int id, String author, String title, float price, int qty){
       this.id = id;
       this.author = author;
       this.title = title;
       this.price = price;
       this.qty = qty;
   }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
