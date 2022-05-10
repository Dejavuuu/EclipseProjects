import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	//because we dont know how many game objects we'll have, create LinkedList
	LinkedList<GameObject> object = new LinkedList<GameObject>();//import LinkedList [shortcut: <cmd><shift><o>]
	
	public void tick() { //updates all game objects
		
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
			
			
		}
		
	}
	//renders all game objects
	public void render(Graphics g) { //import Graphics [shortcut: <cmd><shift><o>]
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		
		}
		
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
		
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
	

}
