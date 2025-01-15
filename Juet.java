public class Juet {
    // Define variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Function to print the values
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an instance of Juet
        Juet juet = new Juet();

        // Assign values using setters
        juet.setName("John");
        juet.setAge(25);

        // Call the print function to display the details
        juet.printDetails();
    }
}
