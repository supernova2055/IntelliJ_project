// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++){
            System.out.println("This is car: " + i);

        }

        Student Student1 = new Student();

        Student1.setAge(25);
        Student1.setName("Harry");

        System.out.println("Student name: " + Student1.getName());
        System.out.println("Student age: " + Student1.getAge());
    }
}