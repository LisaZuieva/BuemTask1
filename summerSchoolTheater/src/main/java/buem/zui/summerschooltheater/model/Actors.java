package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Actors {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Мої параметри
    private String firstName;
    private String lastName;
    private char gender; // do I really need it? do I need to make it ENUM?
    private ActorsVoiceType type;
    private int yearsOfExperience;
    //Опціональні параметри
    private String regards;
    private String titules;

    //Constructors

    public Actors() {
    }

    public Actors(String name, String description, String firstName, String lastName, char gender, ActorsVoiceType type, int yearsOfExperience, String regards, String titules) {
        this.name = name;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.type = type;
        this.yearsOfExperience = yearsOfExperience;
        this.regards = regards;
        this.titules = titules;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public ActorsVoiceType getType() {
        return type;
    }

    public void setType(ActorsVoiceType type) {
        this.type = type;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getRegards() {
        return regards;
    }

    public void setRegards(String regards) {
        this.regards = regards;
    }

    public String getTitules() {
        return titules;
    }

    public void setTitules(String titules) {
        this.titules = titules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actors actors = (Actors) o;
        return getId().equals(actors.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Actors{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", type=" + type +
                ", yearsOfExperience=" + yearsOfExperience +
                ", regards='" + regards + '\'' +
                ", titules='" + titules + '\'' +
                '}';
    }
}
