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
public class testBook2 {
    public static void main(String[] args) {
        author[] authors = new author[2];
        authors[0] = new author("nguyen van hoang", "hoang121@pft.vn", 'm');
        authors[1] = new author("hoang ngoc mai", "mai@gmail.com", 'f');
        
        book2 javaDummy = new book2("java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
       
    }
}
