/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Corbin
 */
public class RectangleAreaCalculator {
    private String length;
    private String width;
    private double area;
    

    public double getArea(String length, String width){
        double l = Double.parseDouble(length);
        double w = Double.parseDouble(width);
        area = l * w;
        return area;
    }
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    public static void main(String[] args) {
        RectangleAreaCalculator rec = new RectangleAreaCalculator();
        
        System.out.println(rec.getArea("3", "3"));
    }
    
}
