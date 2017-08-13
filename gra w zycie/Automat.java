/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


/**
 *
 * @author Sylwik
 */
public class Automat {
    
     int[][] stany;
     int[][] temp;
    public Automat(int x, int y)
    {
   stany=new int[x][y];
   temp=new int[x][y];
   
   for(int i=0; i<stany.length;i++)
   {for(int j=0; j<stany[0].length;j++)
        {
            stany[i][j]=0;
         temp[i][j]=0;
           }  
   }
           
   
    }

    void obliczIteracje(okienko aThis) {
      

         for (int i = 0; i <= stany.length - 1; i++) {
            for (int j = 0; j <= stany[0].length - 1; j++) {
                int neighborhoodCounter = 0;
                int x, y;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k == i && l == j) {
                        } else {
                            if (k == -1)
                                x = stany.length - 1;
                            else if (k == stany.length)
                                x = 0;
                            else
                                x = k;

                            if (l == -1)
                                y = stany[0].length - 1;
                            else if (l == stany[0].length)
                                y = 0;
                            else
                                y = l;

                            if (stany[x][y] == 1)
                                neighborhoodCounter++;

                        }
                    }

                }
                if (neighborhoodCounter == 3 || (neighborhoodCounter == 2 && stany[i][j] == 1)) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = 0;
                }
                if (temp[i][j] != stany[i][j]) {
                    Color color = aThis.setColor(temp[i][j]);
                    aThis.przerysuj(i, j, color);
                }
            }

        }
        for (int i = 0; i < stany.length; i++)
            for (int j = 0; j < stany[0].length; j++) {
                stany[i][j] = temp[i][j];
            }



    }

    void rysujLosowe(int iloscRand, okienko aThis) {
    
        Random random=new Random();
        int x,y;
        for(int i=0; i<=iloscRand; i++)
        {
            
            
        do
        {
            x=random.nextInt(stany.length);
        y=random.nextInt(stany[0].length);
        }
        while(stany[x][y]==1);
        stany[x][y]=1;
        aThis.przerysuj(x, y, Color.green);
        
        
        }
    }
}
