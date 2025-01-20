class Vehicle{
  private static double registrationFee = 500.0;
  private String ownerName;
  private String vehicleType;
  private final int registrationNumber;
  
  //static method to update the registration Fee
   public static void updateRegistrationFee(double newFee){
     registrationFee = newFee;
	 System.out.println("Registration fee updated to: " + registrationFee);
  }
  
  Vehicle(String ownerName, String vehicleType, int registrationNumber){
     this.ownerName = ownerName;
	 this.vehicleType = vehicleType;
	 this.registrationNumber = registrationNumber;
	}
	
   public void displayRegistrationDetails(){
      if(this instanceof Vehicle){
	    System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Number: " + registrationNumber);
	  } else{
	    System.out.println("Object is not an instance of Vehicle class.");
	  }
   }

   public static void main(String[] args){
      Vehicle v1 = new Vehicle("Karan Kumar", "Car", 101);
	  Vehicle v2 = new Vehicle("Palak", "MotorCycle", 102);
	  
	  System.out.println("Vehicle 1 Registration Details:");
	  v1.displayRegistrationDetails();
	  
	  System.out.println("\nVehicle 2 Registration Details: ");
	  v2.displayRegistrationDetails();
      
	  System.out.println("\nUpdating Registration fee..");
	  Vehicle.updateRegistrationFee(600.0);
	  
	  System.out.println("\nVehicle 1 Registration Details After Fee Update: ");
	  v1.displayRegistrationDetails();
	  
	  System.out.println("\nVehicle 2 Registration Details After Fee Update: ");
	  v2.displayRegistrationDetails();
   }   
	
}