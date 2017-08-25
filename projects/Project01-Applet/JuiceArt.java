import java.awt.*;
import java.applet.*;
import java.util.*; 

/**
 *
 *	Art.java	- This program	will create	an	Applet using shapes,	
 *	colors, fonts,	and loops.
 *
 *	@author		April-Angela Bala		aaibala@hawaii.edu
 *	@assignment	Assignment #11: Drawing	Applet
 *					Kapiolani Community College
 *					ICS 111,	Spring 2016
 *	@date			04-26-2016
 **/

public class JuiceArt extends Applet{

	int x	= 40;	
	int y	= 80;
	int ice = 0;
	Random r	= new	Random( ); 
	
	public void	paint(Graphics	g){
				
		Font joke =	new Font("Impact", Font.BOLD,	36);
		g.setColor(Color.black);
		g.setFont(joke);
		g.drawString("What do you call an iPhone charger?", 275, 160);
      
		Font f =	new Font("Arial",	Font.PLAIN,	36);
		g.setColor(Color.red);
		g.setFont(f);
		g.drawString("Apple Juice.", 300, 350);
		
		Color	ctColor = new Color(255, 195,	222);	//	ct	= "cup top"	COLOR
      Color drnkColor = new Color(229, 198, 87);
		Color	iceColor	= new	Color(173, 255, 255); //ICE COLOR 
		Color	strawColor = new Color(250, 248,	184);	//STRAW COLOR 
		
      // Sets drink (apple juice) in place. 
		g.setColor(drnkColor); //DRINK START/SHAPE
		g.fillRect(60,	150, 175, 225);
		g.fillArc(60, 336, 175,	70, 0, -180);
	
      // Creates outlines of the cup
		g.setColor(Color.black);
		g.drawLine(60,	150, 60,	375);	//makes outline for left side	of	cup
		g.drawLine(235, 150,	235, 375); //makes outline	for right side	of	cup 
		g.drawArc(60, 336, 175,	70, 0, -180); //makes outline	for bottom of cup
	
		g.setColor(Color.gray);	
		g.drawArc(61, 355, 174,	30, 0, 180); //makes	outline of cup	bottom, from inside of the	cup
	
		g.setColor(ctColor);	
		g.fillArc(50, 100, 195,	70, 0, 180); //top half	of	drink	lid
		
		g.setColor(strawColor);
		g.fillRect(140, 35, 15,	315);	
		g.fillOval(140, 345,	15, 10);
		
		Color	straw2Color	= new	Color(246, 240, 145);
		g.setColor(straw2Color);
		g.fillOval(140, 30, 15,	10); 
		
		g.setColor(ctColor);
		g.fillArc(50, 100, 195,	70, 0, -180);
      
      // for loop for ice in cup
		for(int loop =	1;	loop <= 50;	loop++){
			g.setColor(iceColor);
			ice =	r.nextInt(10);
			ice =	ice +	10;
			x = r.nextInt(80)+100;
			y = r.nextInt(150)+200;
			g.fillRoundRect(x, y, ice,	ice, 10,	10);
		
			g.setColor(Color.black);
			g.drawRoundRect(x, y, ice+5, ice+5,	10, 10);
			
		}//END of for loop

	}
	
}