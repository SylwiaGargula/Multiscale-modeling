/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naiwny.rozrost.ziaren;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sylwik
 */
public class Moore implements Sasiedztwo{
    
     List<Punkt> points=new ArrayList<Punkt>(0);
    @Override
    public List<Punkt> SetPoints(okno frame) {

        for(int i=-1;i<=1;i++)
        for(int j=-1;j<=1;j++) {
            if (i == 0 && j == 0)
            {continue;}
            else
            points.add(new Punkt(i,j));
        }
        return points;
    }
    
}
