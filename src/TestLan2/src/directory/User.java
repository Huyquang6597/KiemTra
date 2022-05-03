package directory;

public class User {
    private String name;
    private String number;
    private String address;
    private int id;

    public User(String name, String phoneNumber, String gender, String address, String dateOfBirth, String email) {
    }

    public User(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Directory.User{" + "Ten: '" + name + '\'' + ", So DT'" + number + '\'' + ", Dia chi: '" + address + '\'' + ", ID: " + id + '}';
    }
}
