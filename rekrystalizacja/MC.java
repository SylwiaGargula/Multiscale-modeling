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
public class MC {
    List<Punkt> wszystkiePunkty=new ArrayList<>();
     List<Ziarno> ziarna = new ArrayList<>();
    Naiwny naiwny;
    okno frame;
    int iloscZiaren;
    int iloscPrzejsc;
    Komórka[][] pom;
    Sasiedztwo sasiedztwo=new Moore();
    
    public MC(int ilosciteracji, int ilosc, Naiwny naiwny, okno frame)
    {
        iloscZiaren=ilosc;
        iloscPrzejsc=ilosciteracji;
        this.frame=frame;
        this.naiwny=naiwny;
        pom=new Komórka[naiwny.komorki.length][naiwny.komorki[0].length];
    }
    
    
    public void wszystkiePunkty()
    {
    for(int i=0; i<naiwny.komorki.length;i++)
    {
    for(int j=0; j<naiwny.komorki[0].length; j++)
        wszystkiePunkty.add(new Punkt(i, j));
    }
    
    }
    
    public void rozdzielKoloryZarodkom()
    {Random rand = new Random();
        ziarna.removeAll(ziarna);
        for (int i = 0; i < iloscZiaren; i++) {
            ziarna.add(new Ziarno());
        }
     for(int i=0; i<naiwny.komorki.length;i++)
    {
    for(int j=0; j<naiwny.komorki[0].length; j++)
      
    {
        //dopisywanie losowego ziarna do komórki
        naiwny.komorki[i][j].setZiarno(ziarna.get(rand.nextInt(ziarna.size())));
       frame.przerysuj(i, j, naiwny.komorki[i][j].getZiarno().color);
    }
    }
    
    }
    
    
    //wspolrzedne
    public List<Ziarno> ustalSasiadow(int i, int j)
    { List<Ziarno> listaziarn= new ArrayList<>();
        List<Punkt> lista = sasiedztwo.SetPoints(frame);
    
        for (Punkt point1 : lista) {
            Punkt point;
            //czy sasiedzi sa na planszy
            if ((i + point1.x > -1 && j + point1.y > -1) && (i + point1.x < naiwny.komorki.length && j + point1.y < naiwny.komorki[0].length))
                point = new Punkt(i + point1.x, j + point1.y);

            else {

                continue;
            }
//czy sasiad jest inny
            if (pom[i][j].getZiarno().getId() != pom[point.x][point.y].ziarno.getId()) {
                if (!listaziarn.contains(naiwny.komorki[point.x][point.y].getZiarno())) {
                    listaziarn.add(naiwny.komorki[point.x][point.y].ziarno);
                }
            }
        }
        
        
        
    return listaziarn;
    }
    
    
    
   
    public int obliczEnergie(int i, int j,int ID )
    {
     List<Punkt> listasasiadow = sasiedztwo.SetPoints(frame);
        int energia = 0;
        for (Punkt point1 : listasasiadow) {
            Punkt point;
             if ((i + point1.x > -1 && j + point1.y > -1) && (i + point1.x < naiwny.komorki.length && j + point1.y < naiwny.komorki[0].length))
                point = new Punkt(i + point1.x, j + point1.y);

            else {

                continue;
            }

            if (ID != pom[point.x][point.y].ziarno.getId()) {
                energia++;
            }


        }
        return energia;
    
    }
    
    public void naGranicy()
    {
     naiwny.points = naiwny.sasiedztwo.SetPoints(frame);
        for (int i = 0; i < naiwny.komorki.length; i++)
            for (int j = 0; j < naiwny.komorki[0].length; j++) {
                for (Punkt point1 : naiwny.points) {
                    Punkt point;
                    if ((i + point1.x > -1 && j + point1.y > -1) && (i + point1.x < naiwny.komorki.length && j + point1.y < naiwny.komorki[0].length))
                        point = new Punkt(i + point1.x, j + point1.y);
                    else {

                        continue;
                    }
                    //gdy mamy roznego sasiada to badamy
                    if (naiwny.komorki[i][j].getZiarno().getId()!= naiwny.komorki[point.x][point.y].getZiarno().getId()) {
                        wszystkiePunkty.add(new Punkt(i, j));
                        break;
                    }


                }
            }
    
    }
    
    public void zmienStan()
    {
     Random rand = new Random();
        for (int i = 0; i < iloscPrzejsc; i++) {
            pom = naiwny.komorki;
           // wszystkiePunkty();
            naGranicy();
           
            do {
                if (wszystkiePunkty.size() > 0) {
                    int index = rand.nextInt(wszystkiePunkty.size());
                    Punkt wybrany = wszystkiePunkty.get(index);
                   
                    List<Ziarno> lista = ustalSasiadow(wybrany.x, wybrany.y);
                    if (!lista.isEmpty()) {
                        int energia = obliczEnergie(wybrany.x, wybrany.y, naiwny.komorki[wybrany.x][wybrany.y].getZiarno().getId());
                        int nowyStan = rand.nextInt(lista.size());
                        int nowaEnergia = obliczEnergie(wybrany.x, wybrany.y, lista.get(nowyStan).getId());

                        if (nowaEnergia < energia) {
                            naiwny.komorki[wybrany.x][wybrany.y].setZiarno(lista.get(nowyStan));
                            frame.przerysuj(wybrany.x, wybrany.y, lista.get(nowyStan).getColor());
                        }
                    }
                    wszystkiePunkty.remove(wybrany);

                }
            }
            while (!wszystkiePunkty.isEmpty());
            System.out.println(i);
        }
    
    
    }
    
}
