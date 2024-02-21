package Demo.MVC;

public class Controller {
    private View view;
    public Controller(View view){
        this.view = view;
    }

    private boolean checkLogin(Model user){
        if((user.getUrn().equals("admin"))
            && (user.getPass().equals("admin"))){
            return true;
        }
        return false;
    }

    public void login(){
        while (true){
            Model user = view.getUserInfo();
            if(checkLogin(user)){
                view.showMess("success.");
                break;
            }
            else {
                view.showMess("wrong");
            }
        }
    }

    public View getView(){
        return view;
    }
    public void setView(View view){
        this.view = view;
    }
}