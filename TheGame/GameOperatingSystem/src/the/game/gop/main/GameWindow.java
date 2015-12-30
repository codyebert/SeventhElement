package the.game.gop.main;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	

	boolean fullScreenEnabled = false;
	int fullScreenMode = 0;
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

	public GameWindow(String title, int width, int height){
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	private void setfullscreen(){
		switch(fullScreenMode){
			case 0:
				System.out.println("No Fullscreen");
				setUndecorated(false);
				break; 
			case 1:
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setUndecorated(true);
				break;
			case 2:
				device.setFullScreenWindow(this);
				setUndecorated(true);
				break;
		}
	}

	public void setFullscreen(int newFSMode){
		fullScreenEnabled = true; 
		
		if(fullScreenMode <= 2 ){
			this.fullScreenMode = newFSMode;
			setfullscreen();}
		
		else if(fullScreenMode > 2){
			System.err.println("Error"+newFSMode+" is not supported!");
		}
	}
}
	

