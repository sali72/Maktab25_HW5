import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    public String user_name;
    private String password;
    private String name;
    private String last_name;
    private int phone_number;
    private String email;
    private String address;
    private int postal_code;
    ////////////////////////////// getters and setters///////////////////////////////////
    //password
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //last name
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getLast_name() {
        return last_name;
    }
    //phone number
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    public int getPhone_number() {
        return phone_number;
    }
    //email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    //address
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    //postal code
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
    public int getPostal_code() {
        return postal_code;
    }
    //////////////////////// end of setters and getters ///////////////////////////////////////////
}
