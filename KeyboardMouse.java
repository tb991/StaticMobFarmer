/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author tombu
 */
public class KeyboardMouse {

    public static void holdShift(int waitPeriod, int holdTime) throws AWTException, InterruptedException {
        Robot bob = new Robot();
        // use an initial wait period of 5s
        Thread.sleep(waitPeriod * 1000);
        bob.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(holdTime * 1000);
        bob.keyRelease(KeyEvent.VK_SHIFT);
    }

    public static void press(int key) throws AWTException, InterruptedException {
        Robot bob = new Robot();
        bob.keyPress(key);
        Thread.sleep(1);
        bob.keyRelease(key);
    }

    public static void click(int waitPeriod, int holdTime) throws AWTException, InterruptedException {
        Robot bob = new Robot();
        // let Vindicators gather
        Thread.sleep(1000 * waitPeriod);
        // attack them three times
        for (int i = 0; i < 3; i++) {
            bob.mousePress(InputEvent.getMaskForButton(1));
            Thread.sleep(1000 * holdTime);
            bob.mouseRelease(InputEvent.getMaskForButton(1));
            Thread.sleep(1000 * holdTime);
        }
    }
    
    public static void mouseClick(int holdDuration, int mouseBtn) throws AWTException, InterruptedException{
            Robot bob = new Robot();
                     
            bob.mousePress(InputEvent.getMaskForButton(mouseBtn));
            Thread.sleep(1000 * holdDuration);
            bob.mouseRelease(InputEvent.getMaskForButton(mouseBtn));

    }
}
