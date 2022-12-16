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
public class tringle {
    private double hight;
    private double base;
    private double side;
    
    public void sethight(double h)
    {
        hight=h;
    }
    public void setbaset(double b)
    {
        base=b;
    }
     public void setside(double s)
    {
       side=s;
    }
      public double gethight()
    {
       return hight;
    }
      public double getbase()
    {
       return base;
    }
       public double getsidet()
    {
       return side;
    }
        public double getarea()
    {
       return (base*hight)/2;
    }
         public double getcircum()
    {
       return hight+base+side;
    }


}

