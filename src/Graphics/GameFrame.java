package Graphics;

import java.io.IOException;

import javax.swing.JFrame;

import Game.Game;

public class GameFrame extends JFrame implements Runnable {
	Game g;
	GamePanel gp;
	public GameFrame(Game g) 
	{
		super();
		this.g = g;
		
		try {
			gp = new GamePanel(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(gp);
		this.setBounds(0,0,1000,1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
		this.repaint();
		gp.repaint();
		}
	}

}
