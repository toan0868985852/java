/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Huy Toan
 */
public class Product {
    private int id;
    private String name;
    private  int gia;
    private int qty;
    private String description;
   
    public Product(){
        id = 1;
        name = "nam";
        gia = 1000;
        qty = 16;
        description = "còn hàng";
    }
   
       public Product(int id, String name, int gia, int qty, String description){
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.qty = qty;
        this.description = description;
    }
        public int getGia(){
        return gia;
    }
         public double getQty(){
        return qty;
    }
          public double setGia(){
        return gia;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", gia=" + gia + ", qty=" + qty + ", description=" + description + '}';
    }
          
}
