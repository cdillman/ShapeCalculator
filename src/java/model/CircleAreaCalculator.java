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
public class CircleAreaCalculator {
    private String radius;
    private double area;

    public double getArea(String radius){
        double rad = Double.parseDouble(radius);
        area = (rad * rad) * 3.14;
        return area;
    }
    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }
    
    public static void main(String[] args) {
        CircleAreaCalculator cir = new CircleAreaCalculator();
        
        System.out.print(cir.getArea("4"));
    }
}
