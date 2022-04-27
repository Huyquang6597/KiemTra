package directory2;

public class User2 {
    private String name;
    private String phoneNumber;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;


    public User2() {
    }

    public User2(String name, String phoneNumber, String gender, String address, String dateOfBirth,String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public User2 input(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap thong tin: ");
//        System.out.println("Nhap ho ten: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhap tuoi: ");
//        String phoneNumber = scanner.nextLine();
//        System.out.println("Nhap dia chi: ");
//        String address = scanner.nextLine();
//        System.out.println("Nhap ngay sinh: ");
//        String dateOfBirth = scanner.nextLine();
//        System.out.println("Nhap email: ");
//        String email = scanner.nextLine();
//        return new User2(name,phoneNumber,address,dateOfBirth,email);
//    }

    @Override
    public String toString() {
        return "Thong tin nguoi dung: " +
                "Ten: '" + name + '\'' +
                ", So DT: '" + phoneNumber + '\'' +
                ", Gioi tinh: '" + gender + '\'' +
                ", Dia chi: '" + address + '\'' +
                ", Ngay sinh: '" + dateOfBirth + '\'' +
                ", email: '" + email + '\'' +
                '}';
    }
}