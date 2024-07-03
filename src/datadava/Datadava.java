package datadava;

import aa.Announement;
import aa.Faverite;
import aa.User;

import java.util.ArrayList;

public class Datadava {
    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Faverite> faverites = new ArrayList<>();
    private ArrayList<Announement> announementList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Faverite> getFaverites() {
        return faverites;
    }

    public void setFaverites(ArrayList<Faverite> faverites) {
        this.faverites = faverites;
    }

    public ArrayList<Announement> getAnnounementList() {
        return announementList;
    }

    public void setAnnounementList(ArrayList<Announement> announementList) {
        this.announementList = announementList;
    }
}