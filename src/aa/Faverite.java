package aa;

import java.util.List;

public class Faverite {
    private Long id;
    private List<Announement> announements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Announement> getAnnounements() {
        return announements;
    }

    public void setAnnounements(List<Announement> announements) {
        this.announements = announements;
    }

    @Override
    public String toString() {
        return "Faveriteimpl{" +
                "id=" + id +
                ", announements=" + announements +
                '}';
    }

    public Faverite(Long id, List<Announement> announements) {
        this.id = id;
        this.announements = announements;
    }
}
