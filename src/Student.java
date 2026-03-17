public class Student {

    private int id;
    private String name;
    private String department;
    private String email;
    private String phone;

    public Student() {}

    public Student(String name, String department, String email, String phone) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.phone = phone;
    }

    public Student(int id, String name, String department, String email, String phone) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phone = phone;
    }


     public void setName(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

   
}