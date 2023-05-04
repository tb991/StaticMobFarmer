/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Threads;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tombu
 */
public class EscapeAutokickRunnable implements Runnable {
    private volatile boolean running = true;
    private int waitTimeInSeconds = 65;
    public void run(){
        while(running){
            try {
                KeyboardMouse.holdShift(waitTimeInSeconds, 1);
            } catch (AWTException | InterruptedException ex) {
                Logger.getLogger(EscapeAutokickRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
