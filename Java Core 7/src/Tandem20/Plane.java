package Tandem20;
 
 
public abstract class Plane {
String startplane() {
	return "Vzlit Plane";
}
 String takeoffplane() {
	 return "Take off plane";
}
String  landingOfThePlane() {
	return null;
}
double lenght;
double width;
double weight;
public void setLenght(double lenght) {
	this.lenght = lenght;
}
public void setWidth(double width) {
	this.width = width;
}
public void setWeight(double weight) {
	this.weight = weight;
}
void startengines(Object startengines) {
	
	
}
}


