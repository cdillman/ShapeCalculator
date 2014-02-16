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
public class TriangleRightAngleCalculator {
    private String sideA;
    private String sideB;
    private double c;
    private double d;

    public double getSideC(String sideA, String sideB){
        double a = Double.parseDouble(sideA);
        double b = Double.parseDouble(sideB);
        
        d = (a * a) + (b * b);
        c = Math.sqrt(d);
        return c;
    }
    public String getSideA() {
        return sideA;
    }

    public void setSideA(String sideA) {
        this.sideA = sideA;
    }

    public String getSideB() {
        return sideB;
    }

    public void setSideB(String sideB) {
        this.sideB = sideB;
    }
    
    public static void main(String[] args) {
        TriangleRightAngleCalculator tri = new TriangleRightAngleCalculator();
        
        
        System.out.print(tri.getSideC("3", "3"));
    }
}
