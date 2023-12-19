/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegame;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class GameFrame extends JFrame{
    GameFrame(){
        this.setTitle("Methmi's Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        
        this.setLayout(new BorderLayout());
        
        ScorePanel scorePanel = new ScorePanel();
        //WallPanel wallPanel = new WallPanel();
        GamePanel gamePanel = new GamePanel();
        
        //wallPanel.add(gamePanel, BorderLayout.CENTER);

        this. add(scorePanel,BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);
        
        this.setResizable(false);
        this.pack();
        gamePanel.requestFocus();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        
    }
    
}
