package KiemTra_MD2_Lan2;

public class Directory {
    private int number;
    private String groupContact;
    private String name;
    private String gender;
    private String address;
    private int dateOfBirth;
    private String email;
    private int id;

    public Directory() {
    }

    public Directory(int number, String groupContact, String name, String gender, String address, int dateOfBirth, String email , int id) {
        this.number = number;
        this.groupContact = groupContact;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGroupContact() {
        return groupContact;
    }

    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "So DT: " + number +
                ", Nhom: '" + groupContact + '\'' +
                ", Ho Ten: '" + name + '\'' +
                ", Gioi Tinh: '" + gender + '\'' +
                ", Dia Chi: '" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
