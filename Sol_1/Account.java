/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol_1;

/**
 *
 * @author Huy Toan
 */
public class Account {

    private String id;
    private String name;
    private int blance;

    public Account() {

    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int blance) {
        this.id = id;
        this.name = name;
        this.blance = blance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBlance() {
        return blance;
    }
    
    public int credit(int amount){
        blance = blance + amount;
        return blance;
    }
    
    public int debit(int amount){
        if (amount <= blance) {
            blance -= amount;
        }else{
            System.out.println("Amount exceeded balance");            
        }    
        return blance;
    }
    
    public int transferTo(Account another, int amount){
        if (amount <= blance) {
            this.blance = this.blance - amount;
            another.credit(amount);
        }else{
            System.out.println("Amount exceeded balance");
            
        }
        return blance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", blance=" + blance + '}';
    }

}
