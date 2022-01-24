/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.awt.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Graphics;

public class JavaApplication118 extends Panel{

      JavaApplication118 ()
    {
      setBackground (new Color(255,255,255));
    }

     public void paint (Graphics L){
        //tulisan
        L.setColor(Color.black);
        L.setFont(new Font("Times New Roman",Font.BOLD,23));
        L.drawString("RooM01 ", 50,50);
    
        //kotak luar
        L.setColor(Color.DARK_GRAY);
        L.fillRect(100,100,440,460);
       
        L.setColor(Color.GRAY);
        L.fillRect(230,96,220,150);
       
        L.setColor(Color.DARK_GRAY);
        L.fillRect(350,120,60,110);
        
        L.setColor(Color.RED);
        L.fillRect(146,316,340,245);
       
        L.setColor(Color.WHITE);
        L.fillRect(148,318,336,201);
       
        L.setColor(Color.black);
        L.setFont(new Font("Times New Roman",Font.BOLD,20));
        L.drawString("NoName", 170,358);
       
        L.setColor(Color.RED);
        L.fillRect(147,366,336,2);
        L.setColor(Color.RED);
        L.fillRect(147,396,336,2);
        L.setColor(Color.RED);
        L.fillRect(147,426,336,2);
        L.setColor(Color.RED);
        L.fillRect(147,456,336,2);
        L.setColor(Color.RED);
        L.fillRect(147,486,336,2);
       
        L.setColor(Color.WHITE);
        L.fillRect(500,486,30,30);
       
        //3 dimensi
        L.setColor(Color.black);
        L.fillRect(610,90,440,460);
       
        int[] SgtX1 = {600,610,620};
        int[] SgtY1 = {100,90,100};
        L.setColor (new Color(0,0,0));
        L.fillPolygon(SgtX1,SgtY1,3);
       
        int[] Sgtu1 = {1040,1040,1050};
        int[] Sgti1 = {560,550,550};
        L.setColor (new Color(0,0,0));
        L.fillPolygon(Sgtu1,Sgti1,3);
   
        L.setColor(Color.DARK_GRAY);
        L.fillRect(600,100,440,460);
       
        L.setColor(Color.GRAY);
        L.fillRect(730,96,220,150);
       
        L.setColor(Color.DARK_GRAY);
        L.fillRect(850,120,60,110);
       
        L.setColor(Color.RED);
        L.fillRect(646,316,340,245);
       
        L.setColor(Color.WHITE);
        L.fillRect(648,318,336,201);
        
        L.setColor(Color.black);
        L.setFont(new Font("Times New Roman",Font.BOLD,20));
        L.drawString("Error404", 670,358);
       
        L.setColor(Color.RED);
        L.fillRect(647,366,336,2);
        L.setColor(Color.RED);
        L.fillRect(647,396,336,2);
        L.setColor(Color.RED);
        L.fillRect(647,426,336,2);
        L.setColor(Color.RED);
        L.fillRect(647,456,336,2);
        L.setColor(Color.RED);
        L.fillRect(647,486,336,2);
       
         L.setColor(Color.WHITE);
        L.fillRect(1000,486,30,30);
     }

    public static void main(String[] args) {
        {
        Frame ff = new Frame ("2D IMAGE");
            JavaApplication118 p = new JavaApplication118();
        ff.add(p);
        ff.setSize(1500,700);
        ff.setVisible(true);
              }
    }
}
