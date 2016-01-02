package my.sp.generator;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import the.game.gop.main.Vector2F;

public class Block extends Rectangle{
	
	Vector2F pos = new Vector2F(); 
	private int blockSize = 32;

	public Block(Vector2F pos) {	
		this.pos = pos;
	}
	public void tick(double deltaTime)
	{
		  
	}
	public void render(Graphics2D g)
	{
		g.drawRect((int)pos.getWorldLocation().xPos,(int) pos.getWorldLocation().yPos, blockSize, blockSize );
	}

}
