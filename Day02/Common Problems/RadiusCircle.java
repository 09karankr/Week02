class Circle{
  public double radius;
  
  public Circle(){
     this.radius = 2;
  }
  public Circle(double radius){
     this.radius = radius;
  }
  public double calculateArea() {
        return Math.PI * radius * radius;
    }


}
public class RadiusCircle{
  public static void main(String[] args){
     Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: " + defaultCircle.radius);
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
     
	   Circle customCircle = new Circle(5.0);
	    System.out.println("\nCustom Circle Radius: " + customCircle.radius);
        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
  }

}