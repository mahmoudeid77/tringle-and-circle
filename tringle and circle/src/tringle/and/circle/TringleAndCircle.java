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

public class TringleAndCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tringle r1=new tringle();
        System.out.println("the start of tringle calc:");
        r1.sethight(8.0);
        r1.setbaset(4.0);
        r1.setside(2.0);
        r1.getbase();
        r1.gethight();
        r1.getsidet();
        r1.getarea();
        r1.getcircum();
        System.out.println("the area of tringle is = "+r1.getarea());
        System.out.println("the circum of tringle is = "+ r1.getcircum());
        System.out.println("the end of tringle calc");
        System.out.println("####################################################################");
        System.out.println("the start of circle calc:");
        circle r2=new circle();
        r2.setradius(45);
        r2.getradius();
        r2.getareac();
        r2.getcircumf();
        System.out.println("the area of circle is = "+r2.getareac());
        System.out.println("the circum of circle is = "+ r2.getcircumf());
        System.out.println("the end of circle calc");

 

    }
    
}
