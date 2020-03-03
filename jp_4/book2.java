/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_4;

import java.util.Arrays;

/**
 *
 * @author Huy Toan
 */
public class book2 {

    private String name;
    private author[] authors;
    private double price;
    private int qty;

    public book2(String name, author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public book2(String name, author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public author[] getAuthors() {
        return authors;
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
      return "'" + name + "' by " + Arrays.toString(authors) + " price = " + price + ", qty = " + qty;  // author.toString()
   }
   
}
