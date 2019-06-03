package entity;

public class Ti_anwer {

    private String Id;
    private String Username;
    private String Ti;
    private String Youranwer;
    private String Mark;
    private String dodate;

    public Ti_anwer(){}

    public Ti_anwer(String Username,String Ti,String Youranwer,String Mark) {
        this.Id = null; //defaul;
        this.Username = Username;
        this.Ti = Ti;
        this.Youranwer = Youranwer;
        this.Mark = Mark;
        this.dodate = null;//defaul;

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


    public String getYouranwer() {
        return Youranwer;
    }
    public void setYouranwer(String Youranwer) {
        this.Youranwer = Youranwer;
    }


    public String getMark() {
        return Mark;
    }
    public void setMark(String Mark) {
        this.Mark = Mark;
    }


    public String getdodate() {
        return dodate;
    }
    public void setdodate(String dodate) {
        this.dodate = dodate;
    }

}
