/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tombu
 */
public class EatFoodAndReturnRunnable implements Runnable {
    private volatile boolean running = true;
    
    public void run() {
        while (running) {
            try {
                // press 2
                // hold right-click for about 6s
                // press 1
                Thread.sleep(15*60*1000);
                KeyboardMouse.press(KeyEvent.VK_2); // change to food
                Thread.sleep(500);
                KeyboardMouse.mouseClick(10, 3); // eat food
                Thread.sleep(500);
                KeyboardMouse.press(KeyEvent.VK_1); // change to weapon
            } catch (AWTException | InterruptedException ex) {
                Logger.getLogger(EatFoodAndReturnRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
