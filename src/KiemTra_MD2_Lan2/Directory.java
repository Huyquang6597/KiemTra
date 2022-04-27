package KiemTra_MD2_Lan2;

import java.util.Date;

public class Directory {
    private int id;
    private String name;
    private int number;
    private String gender;
    private String address;
    private String dateOfBirth;
//    private String groupContact;
//    private String email;


    public Directory() {
    }

    public Directory(int id, String name, int number, String gender, String address, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
//        this.groupContact = groupContact;
//        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//    public String getGroupContact() {
//        return groupContact;
//    }
//
//    public void setGroupContact(String groupContact) {
//        this.groupContact = groupContact;
//    }

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

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
                ", Ho Ten: '" + name + '\'' +
                ", Gioi Tinh: '" + gender + '\'' +
                ", Dia Chi:     '" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
