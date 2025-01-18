 class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
 }
 public class PersonInfo{
       
        public static void main(String[] args) {
        
        Person originalPerson = new Person("Alice", 25);
        System.out.println("Original Person:");
        originalPerson.displayDetails();

        // Creating a new person using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.displayDetails();
    }
 
 }
    

