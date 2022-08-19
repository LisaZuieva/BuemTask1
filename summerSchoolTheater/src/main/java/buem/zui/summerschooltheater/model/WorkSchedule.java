package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.Objects;

//Work schedule for solist
public class WorkSchedule {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private Troupe solist;
    private Character character;
    private Affiche perfomance;
    private boolean isMainRole;

    public WorkSchedule() {
    }

    public WorkSchedule(String name, String description, Troupe solist, Character character, Affiche perfomance, boolean isMainRole) {
        this.name = name;
        this.description = description;
        this.solist = solist;
        this.character = character;
        this.perfomance = perfomance;
        this.isMainRole = isMainRole;
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

    public Troupe getSolist() {
        return solist;
    }

    public void setSolist(Troupe solist) {
        this.solist = solist;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Affiche getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(Affiche perfomance) {
        this.perfomance = perfomance;
    }

    public boolean isMainRole() {
        return isMainRole;
    }

    public void setMainRole(boolean mainRole) {
        isMainRole = mainRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSchedule that = (WorkSchedule) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", solist=" + solist +
                ", character=" + character +
                ", perfomance=" + perfomance +
                ", isMainRole=" + isMainRole +
                '}';
    }
}
