package buem.zui.summerschooltheater.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

//Repertoir with list of operas
public class Repertoire {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private String titleOfOpera;
    private String authorOfOpera;
    private int durationOfPerfomance;
    private LocalDate dateOfPremier;
    private int budgetOfPerfomance;
    //Додати зміст?

    public Repertoire() {
    }

    public Repertoire(String name, String description, String titleOfOpera, String authorOfOpera, int durationOfPerfomance, LocalDate dateOfPremier, int budgetOfPerfomance) {
        this.name = name;
        this.description = description;
        this.titleOfOpera = titleOfOpera;
        this.authorOfOpera = authorOfOpera;
        this.durationOfPerfomance = durationOfPerfomance;
        this.dateOfPremier = dateOfPremier;
        this.budgetOfPerfomance = budgetOfPerfomance;
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

    public String getTitleOfOpera() {
        return titleOfOpera;
    }

    public void setTitleOfOpera(String titleOfOpera) {
        this.titleOfOpera = titleOfOpera;
    }

    public String getAuthorOfOpera() {
        return authorOfOpera;
    }

    public void setAuthorOfOpera(String authorOfOpera) {
        this.authorOfOpera = authorOfOpera;
    }

    public int getDurationOfPerfomance() {
        return durationOfPerfomance;
    }

    public void setDurationOfPerfomance(int durationOfPerfomance) {
        this.durationOfPerfomance = durationOfPerfomance;
    }

    public LocalDate getDateOfPremier() {
        return dateOfPremier;
    }

    public void setDateOfPremier(LocalDate dateOfPremier) {
        this.dateOfPremier = dateOfPremier;
    }

    public int getBudgetOfPerfomance() {
        return budgetOfPerfomance;
    }

    public void setBudgetOfPerfomance(int budgetOfPerfomance) {
        this.budgetOfPerfomance = budgetOfPerfomance;
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
                ", titleOfOpera='" + titleOfOpera + '\'' +
                ", authorOfOpera='" + authorOfOpera + '\'' +
                ", durationOfPerfomance=" + durationOfPerfomance +
                ", dateOfPremier=" + dateOfPremier +
                ", budgetOfPerfomance=" + budgetOfPerfomance +
                '}';
    }
}
