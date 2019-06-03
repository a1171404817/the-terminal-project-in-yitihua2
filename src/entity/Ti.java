package entity;

public class Ti {

    private String Id;
    private String Ti;

    public Ti(){}

    public Ti( String id,String Ti) {
        this.Id = id; //defaul;
        this.Ti = Ti;

    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTi() {
        return Ti;
    }
    public void setTi(String Ti) {
        this.Ti = Ti;
    }


}
