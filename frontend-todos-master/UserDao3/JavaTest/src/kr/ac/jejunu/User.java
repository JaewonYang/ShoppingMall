package kr.ac.jejunu;

/**
 * Created by Jaewon on 2015-03-20.
 */
public class User {
    private String id;
    private String name;
    private String password;
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id= id;
    }
    public void getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public void getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
