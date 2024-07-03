package servic.servisddao.servisimpldao;

import aa.Announement;
import datadava.Datadava;
import servic.servisddao.Announementdao;

import java.util.List;

public class Announementimldao implements Announementdao {
    private Datadava datadava;

    public Announementimldao(Datadava datadava) {
        this.datadava = datadava;
    }

    @Override
    public List<Announement> getAll() {
        return datadava.getAnnounementList();
    }

    @Override
    public int deleteByPrice(int price) {
        for (Announement announement: datadava.getAnnounementList()){
            if (announement.getPrice()==price){
                datadava.getAnnounementList().remove(price);
            }
        }
        return price;
    }


    @Override
    public Long updateById(Long id) {
        for (Announement announement: datadava.getAnnounementList()){
          announement.setId(id);
        }
        return id;
    }


    @Override
    public Announement updateByAnnouncement(Long id, Announement announement) {
        for (Announement announement1: datadava.getAnnounementList()){
            if (announement1.getId().equals(id)) {
                datadava.getAnnounementList().add(announement);
            }
        }
        return announement;
    }

    @Override
    public Announement addAnnouncement(Announement announcements) {
        datadava.getAnnounementList().add(announcements);
        return announcements;
    }
}