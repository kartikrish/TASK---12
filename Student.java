 import java.io.Serializable;

class Student implements Serializable {

    // serialVersionUID ensures version compatibility
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String email;

    // transient fields are NOT saved during serialization
    transient String password;

    // Constructor
    Student(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Method to display student details
    void display() {
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Password: " + password); // will be null after deserialization
    }
}
    

