package lk.siyapatha.EmailSender.entity;

public class EmailObj {
    private String EmailAddress;
    private int MsgType;

    public EmailObj(String EmailAddress, int MsgType) {
        EmailAddress = EmailAddress;
        this.MsgType = MsgType;
    }

    public EmailObj() {

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

    public void setMsgType(int MsgType) {
        this.MsgType = MsgType;
    }

    @Override
    public String toString() {
        return "EmailObj{" +
                "EmailAddress='" + EmailAddress + '\'' +
                ", MsgType=" + MsgType +
                '}';
    }
}
