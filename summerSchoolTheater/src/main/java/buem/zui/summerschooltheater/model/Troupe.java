package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

//Opera troupe with solists
public class Troupe {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom parametrs
    private String firstName;
    private String lastName;
    private OperaVoiceType type;
    private int yearsOfExperience;
    private String regard;
    //Додати "Партії в репертуарі / які партії виконує"

    public Troupe() {
    }

    public Troupe(String name, String description, String firstName, String lastName, OperaVoiceType type, int yearsOfExperience, String regard) {
        this.name = name;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.yearsOfExperience = yearsOfExperience;
        this.regard = regard;
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

    public OperaVoiceType getType() {
        return type;
    }

    public void setType(OperaVoiceType type) {
        this.type = type;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getRegard() {
        return regard;
    }

    public void setRegard(String regard) {
        this.regard = regard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troupe troupe = (Troupe) o;
        return id.equals(troupe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Troupe{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type=" + type +
                ", yearsOfExperience=" + yearsOfExperience +
                ", regard='" + regard + '\'' +
                '}';
    }
}
