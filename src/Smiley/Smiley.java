package Smiley;

import java.util.Date;

import processing.core.PApplet;


public class Smiley extends PApplet {

	public void setup() {
		size(700,700);
//		background(18, 101, 196);
		
	}
	public void draw() {
	
		fill(255,255,0);
		smiley();
		if(mousePressed && (mouseButton== LEFT))
			{ Date d= new Date();
				background(18, 101, 196);
				pacMan();				
			}
//		delay(150000);
//		exit();
}
	
	public void pacMan() {

		fill(255,255,0);
		arc(350, 350, height, width, 1,7*QUARTER_PI, PIE);
		fill(0,0,0);
		ellipse(180, 200, 110, 130);
		fill(255,255,255);
		super.textSize(25);
		text(toString(),370 ,350);
	}
	
	public void smiley() {
		background(18, 101, 196);
		fill(255,255,0);
		ellipse(width/2, height/2, width, height);
		//EYES
		fill(0,0,0);
		ellipse(180, 200, 110, 130);
		ellipse(520,200, 110, 130);
//		noFill(); //Open to make stroke smile
		arc(350,500,200,200,0,PI);
		
	}
	
	public String toString() {
		Date d= new Date();
		String s= d.toGMTString();
		return s;
	}
		
	}
