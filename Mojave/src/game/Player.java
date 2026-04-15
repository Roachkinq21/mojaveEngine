package game;

public class Player {
	
	GamePanel gp;
	KeyHandler keyH;
	
	int x = 100;
	int y = 100;
	
	int health = 100;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
	}
	



}
