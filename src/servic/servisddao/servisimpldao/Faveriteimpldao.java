package servic.servisddao.servisimpldao;

import aa.Announement;
import aa.Faverite;
import datadava.Datadava;
import servic.servisddao.Faveritedao;

public class Faveriteimpldao implements Faveritedao {
    private Datadava datadava;
    @Override
    public void deleteByid(Long id) {

    }

    @Override
    public void add(Long id) {
        for (Faverite faverite : datadava.getFaverites()){
            if (faverite.getId().equals(id)){
                System.out.println(faverite.getAnnounements());
            }
        }

    }
}
