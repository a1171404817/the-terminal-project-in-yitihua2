package entity;

public class marksbar {
    private String Id;
    private String Username;
    private String sdate;
    private String mark;

    public marksbar(){}

    public marksbar( String  Username,String sdate,String mark) {
        this.Id = null; //defaul;
        this.Username = Username;
        this.sdate =sdate;
        this.mark = mark;

    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUsername() { return Username; }
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getsdate() {
        return sdate;
    }
    public void setsdate(String sdate) {
        this.sdate = sdate;
    }

    public String getmark() {
        return mark;
    }
    public void setmark(String mark) {
        this.mark = mark;
    }


}
