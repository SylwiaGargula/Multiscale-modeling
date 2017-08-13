/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naiwny.rozrost.ziaren;

/**
 *
 * @author Sylwik
 */
public class Komórka {
    int stan;
    Ziarno ziarno;

    public int getStan() {
        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    
   

    public Ziarno getZiarno() {
        return ziarno;
    }

    public void setZiarno(Ziarno ziarno) {
        this.ziarno = ziarno;
    }
    public Komórka()
    {
    this.stan=0;
    
    }
    
}
