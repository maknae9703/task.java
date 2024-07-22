public class Main {
    public class Person {
        private String name;
        private int age;
        private String address;

        // Constructor
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Method to display person details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }

        // Method that accepts a Person object and calls displayDetails
        public void myDetails(Person person) {
            person.displayDetails();
        }

        // Method to print current instance
        public void printCurrentInstance() {
            myDetails(this);
        }

        public static void main(String[] args) {
            // Create an object with your name
            Person Junhgkook = new Person("Jungkook", 26, "Busan");

            // Call the printCurrentInstance method
            Jungkook.printCurrentInstance();
        }
    }

}
