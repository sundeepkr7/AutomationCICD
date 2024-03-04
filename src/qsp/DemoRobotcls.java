package qsp;
import java.awt.event.KeyEvent;


import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.io.*;



//import java.awt.Robot;

public class DemoRobotcls {

	public static void main(String[] args) throws IOException, AWTException {
		Runtime.getRuntime().exec("notepad");
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_SHIFT);
	    r.keyPress(KeyEvent.VK_S);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    r.keyPress(KeyEvent.VK_A);
	    
	}

}