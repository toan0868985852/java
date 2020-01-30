
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


/**
 *
 * @author Huy Toan
 */
public class Rectangle {
        int chieu_rong;
        int chieu_dai;
       private int area;
       private int perimeter;

      
       public Rectangle(){
           this.chieu_rong = 4;
           this.chieu_dai = 5;
       }

    public Rectangle(int chieu_rong, int chieu_dai) {
        this.chieu_rong = chieu_rong;
        this.chieu_dai = chieu_dai;
    }
    
        public void setHeight(int value){
        this.chieu_rong = value;
    }
         
        public void setWidth(int value){
        this.chieu_dai = value;
    }
  
    
    public int getArea(){
        return this.area;
    }
    
    public int getPerimeter(){
         return this.perimeter;
    }
    
    public int getHeight(){
        return this.chieu_rong;
    }
    
    public int getWidth(){
        return this.chieu_dai;
    }

    public void printInfo(){
        System.out.println("---------------------------");
        System.out.println("chiều dài:");
        System.out.printf(" %d\n", this.chieu_dai);
        System.out.println("chiều rộng:");
        System.out.printf(" %d\n", this.chieu_rong);
        System.out.println("diện tích hình chữ nhật:");
        System.out.printf(" %d\n", this.chieu_dai * this.chieu_rong);
        System.out.println("chu vi hình chữ nhật:");
        System.out.printf(" %d\n", (this.chieu_dai + this.chieu_rong)/2);
    }
      
}
