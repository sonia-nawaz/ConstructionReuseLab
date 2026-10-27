package software.reuse.task2;

public class Task2Main {
    public static void main(String[] args) {
        DataBox<String> nameBox = new DataBox<>("Sonia Nawaz");
        DataBox<Integer> idBox = new DataBox<>(2023);

        String name = nameBox.getValue();
        int id = idBox.getValue();

        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);

        // Uncomment this line later to show the compile-time error:
        // DataBox<Integer> badBox = new DataBox<>("Ali");
    }
}