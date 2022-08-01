package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Repertoire {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private String nameOfTheOpera;
    private String author;
    private String characters;
    private String libretto; // or acts, 2-3-4. ENUM?
    private String dateOfPremier;
    private String timeOfPremier;
    private int budget;

    //Constructors

    public Repertoire() {
    }

    public Repertoire(String name, String description, String nameOfTheOpera, String author, String characters, String libretto, String dateOfPremier, String timeOfPremier, int budget) {
        this.name = name;
        this.description = description;
        this.nameOfTheOpera = nameOfTheOpera;
        this.author = author;
        this.characters = characters;
        this.libretto = libretto;
        this.dateOfPremier = dateOfPremier;
        this.timeOfPremier = timeOfPremier;
        this.budget = budget;
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

    public String getNameOfTheOpera() {
        return nameOfTheOpera;
    }

    public void setNameOfTheOpera(String nameOfTheOpera) {
        this.nameOfTheOpera = nameOfTheOpera;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getLibretto() {
        return libretto;
    }

    public void setLibretto(String libretto) {
        this.libretto = libretto;
    }

    public String getDateOfPremier() {
        return dateOfPremier;
    }

    public void setDateOfPremier(String dateOfPremier) {
        this.dateOfPremier = dateOfPremier;
    }

    public String getTimeOfPremier() {
        return timeOfPremier;
    }

    public void setTimeOfPremier(String timeOfPremier) {
        this.timeOfPremier = timeOfPremier;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repertoire that = (Repertoire) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Repertoire{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", nameOfTheOpera='" + nameOfTheOpera + '\'' +
                ", author='" + author + '\'' +
                ", characters='" + characters + '\'' +
                ", libretto='" + libretto + '\'' +
                ", dateOfPremier='" + dateOfPremier + '\'' +
                ", timeOfPremier='" + timeOfPremier + '\'' +
                ", budget=" + budget +
                '}';
    }
}
