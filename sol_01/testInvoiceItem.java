/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Huy Toan
 */
public class testInvoiceItem {

    public static void main(String[] args) {
        InvoiceItem I1 = new InvoiceItem("n21903d", "adsahf", 20, 202.23);
        System.out.println(I1.toString());

        InvoiceItem I2 = new InvoiceItem("t1908a", "gfw3344", 18, 472);
        System.out.println(I2.toString());

        System.out.println("Id: " + I1.getId());
        System.out.println("desc: " + I1.getDesc());
        System.out.println("qty: " + I1.getQty());
        System.out.println("Unitprice: " + I1.getUnitPrice());
        System.out.println("Total: " + I1.gettoTal());
        
        System.out.println("================");
        
        System.out.println("Id: " + I2.getId());
        System.out.println("desc: " + I2.getDesc());
        System.out.println("qty: " + I2.getQty());
        System.out.println("Unitprice: " + I2.getUnitPrice());
        System.out.println("Total: " + I2.gettoTal());
    }
}
