package com;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.*;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

import static org.sikuli.api.API.*;

public class HelloWorldExample {

        public static void main(String[] args) throws MalformedURLException {
                                        
                // Open the main page of Google Code in the default web browser
                browse(new URL("http://localhost:8080/HelloWorld/HelloWorld.html"));

                // Create a screen region object that corresponds to the default monitor in full screen 
                ScreenRegion s = new DesktopScreenRegion();
                                
                // Specify an image as the target to find on the screen
          //      URL imageURL = new URL("http://localhost:8080/HelloWorld/HelloWorld.html");                
             //   Target imageTarget = new ImageTarget(new File("C:/Users/STEST1/Desktop/test.png"));
                Target imageTarget1 = new ImageTarget(new File("C:/Users/STEST1/Desktop/click.png"));

                
                // Wait for the target to become visible on the screen for at most 5 seconds
                // Once the target is visible, it returns a screen region object corresponding
                // to the region occupied by this target
                ScreenRegion r = s.wait(imageTarget1,5000);
             // Construct a Canvas object of the type DesktopCanvas
                Canvas canvas = new DesktopCanvas();
                // Add a box around a screen region 'r'
               // canvas.addBox(r);
                // Add a label on the screen region r
                //canvas.addLabel(r, "WE FOUND IT!!");
                // Display the canvas for 3 seconds
               // canvas.display(3);
                // Display "Hello World" next to the found target for 3 seconds
        //        Canvas canvas = new DesktopCanvas();
               // canvas.addLabel(r, "CHALO World").display(3);
                
                // Click the center of the found target
                Mouse mouse = new DesktopMouse();
                mouse.click(r.getCenter());
                
                Target imageTarget = new ImageTarget(new File("C:/Users/STEST1/Desktop/ole.png"));
                ScreenRegion   r1 = s.wait(imageTarget,5000);
                 Mouse mouse1 = new DesktopMouse();
                 mouse1.click(r1.getCenter());
                 Target imageTarget2 = new ImageTarget(new File("C:/Users/STEST1/Desktop/ccc.png"));
                 ScreenRegion ss=  s.find(imageTarget2);
                 ScreenRegion sr = s.wait(imageTarget2,5000);
                 Mouse mouse2 = new DesktopMouse();
                 mouse2.click(ss.getCenter());
                
                 
                 Target imageTarget3 = new ImageTarget(new File("C:/Users/STEST1/Desktop/ole.png"));
                 ScreenRegion   r3 = s.wait(imageTarget3,5000);
                  Mouse mouse3 = new DesktopMouse();
                  mouse1.click(r3.getCenter());
             //   ScreenRegion r1 = s.wait(imageTarget,5000);
            //    mouse.click(r1.getCenter());
        }
}