package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.Objects;

//Affiche with Performances
public class Affiche {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private Repertoire opera;
    private LocalDateTime dateAndTimeOfPerformance;
    private int ticketPrice;

    public Affiche() {
    }

    public Affiche(String name, String description, Repertoire opera, LocalDateTime dateAndTimeOfPerformance, int ticketPrice) {
        this.name = name;
        this.description = description;
        this.opera = opera;
        this.dateAndTimeOfPerformance = dateAndTimeOfPerformance;
        this.ticketPrice = ticketPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Repertoire getOpera() {
        return opera;
    }

    public void setOpera(Repertoire opera) {
        this.opera = opera;
    }

    public LocalDateTime getDateAndTimeOfPerformance() {
        return dateAndTimeOfPerformance;
    }

    public void setDateAndTimeOfPerformance(LocalDateTime dateAndTimeOfPerformance) {
        this.dateAndTimeOfPerformance = dateAndTimeOfPerformance;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiche affiche = (Affiche) o;
        return getId().equals(affiche.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Affiche{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", opera=" + opera +
                ", dateAndTimeOfPerformance=" + dateAndTimeOfPerformance +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
