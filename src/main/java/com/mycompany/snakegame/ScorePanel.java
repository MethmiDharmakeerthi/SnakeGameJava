/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class ScorePanel extends JPanel{
    static final int S_SCREEN_WIDTH =600;
    static final int S_SCREEN_HEIGHT=100;
    
    public ScorePanel(){
        this.setPreferredSize(new Dimension(S_SCREEN_WIDTH,S_SCREEN_HEIGHT));
        this.setBackground(Color.blue);
        this.setFocusable(true);   
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Get the dimensions of the panel
        int panelWidth=getWidth();
        int panelHeight=getHeight();
        
        //set the color for filling the panel
        //g.setColor(Color.green);
        g.setColor(new Color(130,195,95,255));
        g.fillRect(0,0,panelWidth, panelHeight);
    }
}

