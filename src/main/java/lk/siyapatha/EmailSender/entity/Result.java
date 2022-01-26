package lk.siyapatha.EmailSender.entity;

public class Result {
    private String Respone;
    private int Status;

    public Result() {
    }

    public Result(String respone, int status) {
        Respone = respone;
        Status = status;
    }

    public String getRespone() {
        return Respone;
    }

    public void setRespone(String respone) {
        Respone = respone;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Respone='" + Respone + '\'' +
                ", Status=" + Status +
                '}';
    }
}
