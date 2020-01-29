package com.company;

import com.company.Felulet.sakkfelulet;
import com.company.Logika.sakktabla;

public class Main {

    public static void main(String[] args) {

        sakkfelulet s=new sakkfelulet();


        sakktabla t= new sakktabla();
        System.out.println(t);
        t.lep(6,4,4,4);
        System.out.println(t);
        t.lep(6,4,4,2);
    }
}
