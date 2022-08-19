package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

//List of Characters in Opera
public class Character {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private Repertoire opera;
    private String characterName;
    private OperaVoiceType type;

    public Character() {
    }

    public Character(String name, String description, Repertoire opera, String characterName, OperaVoiceType type) {
        this.name = name;
        this.description = description;
        this.opera = opera;
        this.characterName = characterName;
        this.type = type;
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

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public OperaVoiceType getType() {
        return type;
    }

    public void setType(OperaVoiceType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return getId().equals(character.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", opera=" + opera +
                ", characterName='" + characterName + '\'' +
                ", type=" + type +
                '}';
    }
}
