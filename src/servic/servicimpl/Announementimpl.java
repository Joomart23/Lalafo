package servic.servicimpl;

import aa.Announement;
import datadava.Datadava;
import servic.Announementservis;
import servic.servisddao.servisimpldao.Announementimldao;

import java.util.List;

public class Announementimpl implements Announementservis {
    private Datadava datadava;
    Announementimldao announementimldao;

    public Announementimpl(Datadava datadava, Announementimldao announementimldao) {
        this.datadava = datadava;
        this.announementimldao = announementimldao;
    }

    @Override
    public List<Announement> getAll() {
        return announementimldao.getAll();
    }

    @Override
    public int deleteByPrice(int price) {
        return announementimldao.deleteByPrice(price);
    }

    @Override
    public Long updateById(Long id) {
        return announementimldao.updateById(id);
    }

    @Override
    public Announement updateByAnnouncement(Long id, Announement announement) {
        return announementimldao.updateByAnnouncement(id,announement);
    }

    @Override
    public Announement addAnnouncement(Announement announcements) {
        return announementimldao.addAnnouncement(announcements);
    }
}
