package servic.servisddao;

import aa.Announement;

import java.util.List;
import java.util.Map;

public interface Announementdao {

   List<Announement> getAll ();
   int deleteByPrice(int price );
   Long updateById(Long   id);
   Announement  updateByAnnouncement(Long id,Announement announement);
   Announement addAnnouncement(Announement announcements);



}
