/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringle.and.circle;

/**
 *
 * 
 */
public class circle {
    private double radius;
    
    public void setradius(double r)
    {
        radius=r;
    }
    public double getradius()
    {
        return radius;
    }
    public double getareac()
    {
        return radius*radius*3.14;
    }
     public double getcircumf()
    {
        return radius*2*3.14;
    }
    
}
