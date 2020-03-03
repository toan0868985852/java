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
public class testBook {
    public static void main(String[] args) {
        author code = new author("code lean", "code2323@fpt.edu.vn", 'f');
        System.out.println(code);
        
        book mybook = new book("java for dummy", code, 19.95, 99);
        System.out.println(mybook);
        System.out.println("---------------------------------");
        mybook.setPrice(29.95);
        mybook.setQty(28);
        
        System.out.println("name: " + mybook.getName());
        System.out.println("price: " + mybook.getPrice());
        System.out.println("qty: " + mybook.getQty());
        System.out.println("author: " + mybook.getAuthor());
        System.out.println("author name: " + mybook.getAuthor().getName());
        System.out.println("author email: " + mybook.getAuthor().getEmail());
        System.out.println("-------------------------------------");
        book anotherBook = new book("more java", new author("nguyen huy toan", "toan0902148285@gmail.com", 'm'),29.95);
        System.out.println(anotherBook);
        System.out.println("--------------------------------------");
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());
        System.out.println("-------------------------------------");
        System.out.println(anotherBook.getAuthorName());
        
    }
}
