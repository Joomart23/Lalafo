package servic;

import aa.Announement;

import java.util.List;

public interface Announementservis {
    List<Announement> getAll ();
    int deleteByPrice(int price );
    Long updateById(Long   id);
    Announement  updateByAnnouncement(Long id,Announement announement);
    Announement addAnnouncement(Announement announcements);



}
