package servic.servisddao.servisimpldao;

import aa.User;
import datadava.Datadava;
import servic.servisddao.Userdao;

public class Userimpldao implements Userdao {
    private Datadava datadava;
    @Override
    public void getAll() {
        System.out.println(datadava.getUserList());
    }

    @Override
    public void add(User user) {
        System.out.println(datadava.getUserList().add(user));

    }
}
