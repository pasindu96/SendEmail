package lk.siyapatha.EmailSender.entity;

public class ContactUs {

    private String Name;
    private String EmailAddress;
    private String MsgType;
    private String Phone;
    private String Company;

    public ContactUs() {
    }

    public ContactUs(String name, String emailAddress, String msgType) {
        Name = name;
        EmailAddress = emailAddress;
        MsgType = msgType;
    }

    public ContactUs(String name, String emailAddress, String msgType, String phone, String company) {
        Name = name;
        EmailAddress = emailAddress;
        MsgType = msgType;
        Phone = phone;
        Company = company;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "Name='" + Name + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", MsgType=" + MsgType +
                ", Phone='" + Phone + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }
}
