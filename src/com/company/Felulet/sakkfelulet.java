package com.company.Felulet;

import com.company.Logika.sakktabla;

import javax.swing.*;
import java.awt.*;

public class sakkfelulet extends JFrame {
    private Container foablak;
    private JPanel pnlJatektabla;
    private sakktabla tabla;

    public sakkfelulet()
    {
        this.tabla=new sakktabla();
        initComponents();
        this.sakktablamegjelenit();
    }

    private void initComponents()
    {
        this.setTitle("Sakk 1.0");
        int width=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height= (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setSize(width,height);

        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);

        this.foablak=this.getContentPane();
        this.foablak.setLayout(new BorderLayout(10,10));

        this.pnlJatektabla=new JPanel();
        this.pnlJatektabla.setLayout(new GridLayout(9,9));

        this.foablak.add(BorderLayout.CENTER,this.pnlJatektabla);



        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void sakktablamegjelenit()
    {
        this.pnlJatektabla.removeAll();

        this.pnlJatektabla.add(new JLabel());

        for (int i = 0; i <8 ; i++) {
            JLabel hivatkozasABC=new JLabel();
            hivatkozasABC.setText(String.format("%s.",(char)(i+65)));
            hivatkozasABC.setHorizontalAlignment(SwingConstants.CENTER);
            hivatkozasABC.setVerticalAlignment(SwingConstants.CENTER);
            this.pnlJatektabla.add(hivatkozasABC);
        }



        for (int i = 0; i < 8; i++) {
            JLabel hivatkozas123=new JLabel();
            hivatkozas123.setText(String.format("%d",(8-i)));
            hivatkozas123.setHorizontalAlignment(SwingConstants.CENTER);
            hivatkozas123.setVerticalAlignment(SwingConstants.CENTER);
            this.pnlJatektabla.add(hivatkozas123);
            for (int j = 0; j < 8; j++) {
                mezo m=new mezo(i,j,tabla.getErtek(i,j));
                this.pnlJatektabla.add(m);
            }
        }
        this.revalidate();
        this.repaint();
    }



}
