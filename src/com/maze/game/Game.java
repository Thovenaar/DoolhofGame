/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maze.game;

import javax.swing.JFrame;

/**
 *
 * @author thomas_laptop
 */
public class Game {

    public static JFrame frame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frame = new JFrame("Doolhof");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}