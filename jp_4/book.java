/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_4;

/**
 *
 * @author Huy Toan
 */
public class book {

    private String name;
    private author author;
    private double price;
    private int qty;

    public book(String name, author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public book(String name, author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "book{" + "name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }

    public String getAuthorName() {
        return author.getName();
    }

}
