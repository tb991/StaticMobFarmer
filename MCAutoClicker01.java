/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAutoClicker01;

import Frames.StartNCount;
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        StartNCount main = new StartNCount();
        main.setVisible(true);
        
    }

}
