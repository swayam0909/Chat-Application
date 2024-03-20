package com.example.chatmessanger;

public class Users {
    String profilepic;

    public Users() {
    }

    public Users(String userId, String userName, String mail, String passwrod, String profilepic, String status) {
        this.profilepic = profilepic;
        this.mail = mail;
        this.passwrod = passwrod;
        this.userName = userName;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.status = status;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String mail;
    String passwrod;
    String userName;
    String userId;
    String lastMessage;
    String status;
}
