package buem.zui.summerschooltheater.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contract {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private String firstName;
    private String lastName;
    private ActorsGender gender;
    private TypeOfRole type;
    private int amountOfWork;
    private String contractStartDate;
    private String contractEndDate;

    public Contract() {
    }

    public Contract(String name, String description, LocalDateTime createAt, LocalDateTime updateAt, String firstName, String lastName, ActorsGender gender, TypeOfRole type, int amountOfWork, String contractStartDate, String contractEndDate) {
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.type = type;
        this.amountOfWork = amountOfWork;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
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

    public ActorsGender getGender() {
        return gender;
    }

    public void setGender(ActorsGender gender) {
        this.gender = gender;
    }

    public TypeOfRole getType() {
        return type;
    }

    public void setType(TypeOfRole type) {
        this.type = type;
    }

    public int getAmountOfWork() {
        return amountOfWork;
    }

    public void setAmountOfWork(int amountOfWork) {
        this.amountOfWork = amountOfWork;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return getId().equals(contract.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", type=" + type +
                ", amountOfWork=" + amountOfWork +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", contractEndDate='" + contractEndDate + '\'' +
                '}';
    }
}
