class Circle{
  double radius;
  
  Circle(double radius){
    this.radius = radius;
  }
  public double area(double radius){
      double result = 3.14 * radius * radius;
	  return result;
  
  }
  void displayArea(){
     System.out.println("Area of the circle is: " + area(radius));
  
  }
}

public class CircleArea{
   public static void main(String[] args){
      Circle circle = new Circle(4.2);
	  circle.displayArea();
   
   }

}