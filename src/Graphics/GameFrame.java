package Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;

import Game.Game;

public class GameFrame extends JFrame implements Runnable,KeyListener {
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
		this.addKeyListener(this);
		
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		System.out.println(gp.getgreeny());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
