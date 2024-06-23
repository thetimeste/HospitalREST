package com.example.demo;

public class User {
    private String userID;
    private String name;
    private String surname;
    private String birthdate;
    private String socialnumber;
    private String phone;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSocialnumber() {
        return socialnumber;
    }

    public void setSocialnumber(String socialnumber) {
        this.socialnumber = socialnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }



@Override
public String toString() {
    return "UserData{" +
            "userID='" + userID + '\'' +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", birthdate='" + birthdate + '\'' +
            ", socialnumber='" + socialnumber + '\'' +
            ", phone='" + phone + '\'' +
            '}';
}


}