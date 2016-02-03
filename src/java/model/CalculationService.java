/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Taylor
 */
public class CalculationService {
    public String getRectangleArea(String len, String wide) throws IllegalArgumentException{
        String area;
        
        double length = Double.parseDouble(len);
        double width = Double.parseDouble(wide);
        
        double dubArea = length * width;
        
        area =  Double.toString(dubArea);
        
        return area;
    }
    
    public String getCircleArea(String rad) throws IllegalArgumentException{
        String area;
        
        double radius = Double.parseDouble(rad);
        
        double dubArea = (radius * radius) * 3.14;
        
        area = Double.toString(dubArea);
        
        return area;
    }
}