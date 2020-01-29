package com.company.Felulet;

import javax.swing.*;
import java.awt.*;

public class mezo extends JButton{

    private int x;
    private int y;
    private int ertek;

    public mezo(int x, int y, int ertek) {
        this.x = x;
        this.y = y;
        this.ertek = ertek;

        this.frissit();
    }

    public void frissit()
    {
        if ((this.x+this.y)%2==0)
        {
            this.setBackground(Color.decode("#FFFFFF"));
        }
        else
        {
            this.setBackground(Color.decode("#8B4513"));
        }

        String fajlnev="img/ures.png";

        switch (this.ertek)
        {
            case 11: fajlnev="img/11-gyalog-feher.png";break;
            case 12: fajlnev="img/12-bastya-feher.png";break;
            case 13: fajlnev="img/13-huszar-feher.png";break;
            case 14: fajlnev="img/14-futo-feher.png";break;
            case 15: fajlnev="img/15-kiraly-feher.png";break;
            case 16: fajlnev="img/16-vezer-feher.png";break;
            case 21: fajlnev="img/21-gyalog-fekete.png";break;
            case 22: fajlnev="img/22-bastya-fekete.png";break;
            case 23: fajlnev="img/23-huszar-fekete.png";break;
            case 24: fajlnev="img/24-futo-fekete.png";break;
            case 25: fajlnev="img/25-kiraly-fekete.png";break;
            case 26: fajlnev="img/26-vezer-fekete.png";break;
        }
        Image img = new ImageIcon(fajlnev).getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(img));
        this.revalidate();
        this.repaint();
    }




}
