/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naiwny.rozrost.ziaren;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Sylwik
 */
public class Ziarno {
    
  public  static int licznik=0;
  public  Color color;
 public   int id;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   public Ziarno()
   {
     this.id = licznik;
        licznik++;
        Random rand=new Random();

        //kolor
        int[] tab=new int[3];
        for(int i=0;i<3;i++)
        tab[i]=rand.nextInt(256);

        color=new Color(tab[0],tab[1],tab[2]);
   
   
   }
    
}
