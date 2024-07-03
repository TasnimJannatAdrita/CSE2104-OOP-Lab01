/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

public class Rectangle {
    
     double length;
     double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    
    public double calculateArea() {
        return length * width;
    }

    
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(6.0, 2.0);
        Rectangle rect2 = new Rectangle(9.5, 4.5);

        
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.length + ", Width: " + rect1.width);
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println("Area: " + rect1.calculateArea());

        
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.length + ", Width: " + rect2.width);
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println("Area: " + rect2.calculateArea());
    }
}
