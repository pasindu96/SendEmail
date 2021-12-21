package lk.siyapatha.EmailSender.entity;

public class ContactUs {

    private String Name;
    private String EmailAddress;
    private int MsgType;

    public ContactUs() {
    }

    public ContactUs(String name, String emailAddress, int msgType) {
        Name = name;
        EmailAddress = emailAddress;
        MsgType = msgType;
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

    public int getMsgType() {
        return MsgType;
    }

    public void setMsgType(int msgType) {
        MsgType = msgType;
    }

    @Override
    public String toString() {
        return "EmailInfor{" +
                "Name='" + Name + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", MsgType=" + MsgType +
                '}';
    }
}
