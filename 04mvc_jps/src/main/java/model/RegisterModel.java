package model;

import db_hooks.Db_hook;

public class RegisterModel {
    private int usernameId;
    private String userName;
    private String userCity;
    private int age;

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(int usernameId) {
        this.usernameId = usernameId;
    }

   public boolean registerUser(){
       Db_hook db=new Db_hook();
       return db.insertNewUSer(userName,userCity,age,usernameId)>0;
   }


}
