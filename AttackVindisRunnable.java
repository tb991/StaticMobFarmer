/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tombu
 */
public class AttackVindisRunnable implements Runnable {
    private volatile boolean running = true;
    
   public void stopRunning(){
        this.running = false;
    }
    @Override
    public void run() {
        
        while(true){
            try {
            Robot bob = new Robot();
            int waitPeriod = 60; //seconds
            int holdTime = 1;
            try {
                // let Vindicators gather
                Thread.sleep(1000*waitPeriod);
            } catch (InterruptedException ex) {
                Logger.getLogger(AttackVindisRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
            // attack them three times
            if (running){
                for (int i = 0; i < 3; i++){
                    bob.mousePress(InputEvent.getMaskForButton(1));
                    try {
                        Thread.sleep(1000*holdTime);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AttackVindisRunnable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    bob.mouseRelease(InputEvent.getMaskForButton(1));
                    try {
                        Thread.sleep(1000*holdTime);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AttackVindisRunnable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (AWTException ex) {
            Logger.getLogger(AttackVindisRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}