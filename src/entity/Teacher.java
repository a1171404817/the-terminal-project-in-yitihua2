package entity;

public class Teacher {
    private String Id;
    private String Username;
    private String Password;
    private String Name;
    private String Sex;
    private String Age;
    public Teacher(){}

    public Teacher( String  Username,String Password,String Name,String Sex, String Age) {
        this.Id = null; //defaul;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Sex = Sex;
        this.Age = Age;
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

    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getAge() {
        return Age;
    }

    public void setage(String Age) {
        this.Age = Age;
    }
}
