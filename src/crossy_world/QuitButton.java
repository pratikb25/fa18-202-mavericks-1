import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuitButton extends Actor
{
	World w = null;
	
	public QuitButton(World w) {
		this.w = w;
	}
	
    /**
     * Act - do whatever the QuitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
		if (Greenfoot.mouseClicked(this)) {
			((StartScreen)w).exitGame();
		}
    }    
}