package the.game.gop.main;

public class Vector2F {
	
	public static float xPos;
	public static float yPos;
	public static float worldXPos;
	public static float worldYPos;

	//Constructors
	public Vector2F(float x, float y) {
		this.xPos = x;
		this.yPos = y;
		
	}
	public Vector2F() {
		this.xPos = 0.0f;
		this.yPos = 0.0f;
	}
	//Zeros out the position
	public static Vector2F zero()
	{
		return new Vector2F(0,0);
	}
	//Normalizes the vector
	public static void normalize()
	{
		double length = Math.sqrt(xPos * xPos + yPos* yPos);
		
		if(length != 0.0)
		{
			float s = 1.0f/(float) length;
			xPos = xPos * s;
			yPos = yPos * s; 
		}
	}
	public boolean equals(Vector2F vect)
	{
		return (this.xPos == vect.xPos && this.yPos == vect.yPos);
	}
	//Creates a new copy of given vector
	public Vector2F copy(Vector2F vect)
	{
		xPos = vect.xPos;
		yPos = vect.yPos;
		return new Vector2F(xPos, yPos);
	}
	//Adds two vectors
	public Vector2F add(Vector2F vect)
	{
		xPos = xPos + vect.xPos;
		yPos = yPos + vect.yPos;
		return new Vector2F(xPos, yPos);
	}
	//Sets world x and y positions
	public static void setWorldVariables(float worldX, float worldY)
	{
		worldXPos = worldX;
		worldYPos = worldY;
	}
	//Gives distance on the  visible screen
	public static double getDistanceOnScreen(Vector2F vect1, Vector2F vect2)
	{
		float v1 = vect1.xPos - vect2.xPos;
		float v2 = vect1.yPos - vect2.yPos;
		return Math.sqrt(v1*v1 + v2*v2);

	}
	//Gets location on screen
	public Vector2F getScreenLocation()
	{
		return new Vector2F(xPos, yPos);
	}
	//Gets location in the world
	public Vector2F getWorldLocation()
	{
		return new Vector2F(xPos-worldXPos, yPos-worldYPos);
	}
	//Gives distance between two world vectors
	public double getDistanceBetweenWorldVectors(Vector2F vect)
	{
		float dx = Math.abs(getWorldLocation().xPos - vect.getWorldLocation().xPos);
		float dy = Math.abs(getWorldLocation().yPos - vect.getWorldLocation().yPos);
		return Math.abs(dx*dx - dy*dy);
	}

}
