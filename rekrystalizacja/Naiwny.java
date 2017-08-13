/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naiwny.rozrost.ziaren;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sylwik
 */
public class Naiwny {
    
     Komórka[][] komorki;
     Komórka[][] temp;
     Sasiedztwo sasiedztwo;
      public List<Ziarno> ziarna = new ArrayList<Ziarno>(0);
      List<Punkt> points = new ArrayList<Punkt>(0);
   


int rozmiar;

     public Naiwny(int x, int y)
     {
         
    komorki=new Komórka[x][y];
        temp=new Komórka[x][y];
      
        rozmiar=x*y;

     for (int i=0; i<x; i++)
     {
     for(int j=0; j<y; j++)
     {
    
     komorki[i][j]=new Komórka();
     temp[i][j]=new Komórka();
     
     
     }
     }
     //domyslnie
     sasiedztwo=new Moore();
     }
    
  
     
    
}