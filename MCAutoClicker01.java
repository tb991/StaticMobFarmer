/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAutoClicker01;

import Threads.AttackVindisRunnable;
import Threads.EatFoodAndReturnRunnable;
import Threads.EscapeAutokickRunnable;
import scanner.Screen;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

/**
 * system for detecting small graphics expansions, indicating a vehicle moving
 * toward us also logs evasion in any direction
 *
 * @author tombu
 */
public class MCAutoClicker01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        EscapeAutokickRunnable bossman = new EscapeAutokickRunnable();
        AttackVindisRunnable bossman2 = new AttackVindisRunnable();
        EatFoodAndReturnRunnable bossman3 = new EatFoodAndReturnRunnable();
        Thread king = new Thread(bossman);
        Thread queen = new Thread(bossman2);
        Thread prince = new Thread(bossman3);
        king.start();
        queen.start();
        prince.start();
    }

}
