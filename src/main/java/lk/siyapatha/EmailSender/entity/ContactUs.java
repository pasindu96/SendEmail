package lk.siyapatha.EmailSender.entity;

public class ContactUs {

    private String Name;
    private String Email;
    private String Phone;
    private String Message;

    public ContactUs() {
    }

    public ContactUs(String name, String email, String phone, String message) {
        Name = name;
        Email = email;
        Phone = phone;
        Message = message;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Message='" + Message + '\'' +
                '}';
    }
}
