package entity;

public class Tiku {

    private String Id;
    private String Username;
    private String Ti;
    private String RightAnwer;
    private String YourAnwer;
    private String Mark;
    private String DoDate;
    public Tiku(){}

    public Tiku( String Username,String Ti,String RightAnwer,String YourAnwer, String Mark) {
        this.Id = null; //defaul;
        this.Username = Username;
        this.Ti = Ti;
        this.RightAnwer = RightAnwer;
        this.YourAnwer = YourAnwer;
        this.Mark =Mark;
        this.DoDate=null;//defaul;
    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getTi() {
        return Ti;
    }
    public void setTi(String Ti) {
        this.Ti = Ti;
    }

    public String getRightAnwer() {
        return RightAnwer;
    }
    public void setRightAnwer(String RightAnwer) {
        this.RightAnwer = RightAnwer;
    }

    public String getYourAnwer() {
        return YourAnwer;
    }
    public void setYourAnwer(String YourAnwer) {
        this.YourAnwer = YourAnwer;
    }

    public String getMark() {
        return Mark;
    }
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    public String getDoDate() {
        return DoDate;
    }
    public void setDoDate(String DoDate) {
        this.DoDate = DoDate;
    }

}
