package my.sp.GameState;

import java.awt.Graphics2D;
import java.util.Stack;

public class GameStateManager {
	
	public static Stack<GameState> states;
	
	public  GameStateManager() 
	{
		states = new Stack<GameState>();
		 
	}
	public void tick(double deltaTime)
	{
		states.peek().tick(deltaTime);
	}
	public void render(Graphics2D g)
	{
		states.peek().render(g) ;
	}
	
}
