package Demo.MVC;

public class Model {
    private String userName;
    private String passWord;
    public Model(){
    }
    public Model(String userName, String passWord){
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUrn(){
        return userName;
    }
    public void setUrn(String userName){
        this.userName = userName;
    }

    public String getPass(){
        return passWord;
    }
    public void setPass(String passWord){
        this.passWord = passWord;
    }
}
