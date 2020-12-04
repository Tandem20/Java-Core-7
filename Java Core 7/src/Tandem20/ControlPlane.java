package Tandem20;

public class ControlPlane extends Plane {
	double moveup ;
	  
	double movedown;
		
	double moveleft;
		
	double moveright;
		
	
	public String setMoveup() {
		this.moveup = moveup;
		return  "Cy27 move Up 1000km";
		
	}
	public String setMovedown(double movedown) {
		this.movedown = movedown;
		return "Cy27 move Down 500km";
		
	}
	public String  setMoveleft() {
		this.moveleft = moveleft;
		return "Cy27 move Left 400km";
		
	}
	public String setMoveright(double moveright) {
		this.moveright = moveright;
		return "Cy27 move Right 600km";
		
	}
	@Override
	String startplane() {
		return "Vzlit Plane";
		
		
	}
	@Override
	String takeoffplane() {
		return "Take off plane";
		
	}
	@Override
	String landingOfThePlane() {
		return "Landing Of The Plane";
		
	}
	
}
