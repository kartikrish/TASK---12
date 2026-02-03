import java.io.*;

public class Main {

    public static void main(String[] args) {

        // File name where object will be stored
        String fileName = "student.ser";

        // ================= SERIALIZATION =================
        try {
            Student s1 = new Student(
                    101,
                    "Kartik",
                    "kartik@email.com",
                    "secret123"
            );

            // Writing object to file
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("✅ Object Serialized Successfully\n");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // ================= DESERIALIZATION =================
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student restoredStudent = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("✅ Object Deserialized Successfully\n");

            // Validate restored object
            restoredStudent.display();

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException (Requirement #7)
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
