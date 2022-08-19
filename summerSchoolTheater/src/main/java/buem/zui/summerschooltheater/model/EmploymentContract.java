package buem.zui.summerschooltheater.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//EmploymentContract with contract
public class EmploymentContract {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Custom
    private Troupe solist;
    private int amountOfOperasPerYear;
    private LocalDate dataBegginingOfContract;
    private LocalDate dataEndingOfContract;
    private int salaryAmount;
    private boolean isHaveBonus;

    public EmploymentContract() {
    }

    public EmploymentContract(String name, String description, Troupe solist, int amountOfOperasPerYear, LocalDate dataBegginingOfContract, LocalDate dataEndingOfContract, int salaryAmount, boolean isHaveBonus) {
        this.name = name;
        this.description = description;
        this.solist = solist;
        this.amountOfOperasPerYear = amountOfOperasPerYear;
        this.dataBegginingOfContract = dataBegginingOfContract;
        this.dataEndingOfContract = dataEndingOfContract;
        this.salaryAmount = salaryAmount;
        this.isHaveBonus = isHaveBonus;
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

    public int getAmountOfOperasPerYear() {
        return amountOfOperasPerYear;
    }

    public void setAmountOfOperasPerYear(int amountOfOperasPerYear) {
        this.amountOfOperasPerYear = amountOfOperasPerYear;
    }

    public LocalDate getDataBegginingOfContract() {
        return dataBegginingOfContract;
    }

    public void setDataBegginingOfContract(LocalDate dataBegginingOfContract) {
        this.dataBegginingOfContract = dataBegginingOfContract;
    }

    public LocalDate getDataEndingOfContract() {
        return dataEndingOfContract;
    }

    public void setDataEndingOfContract(LocalDate dataEndingOfContract) {
        this.dataEndingOfContract = dataEndingOfContract;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public boolean isHaveBonus() {
        return isHaveBonus;
    }

    public void setHaveBonus(boolean haveBonus) {
        isHaveBonus = haveBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmploymentContract that = (EmploymentContract) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "EmploymentContract{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", solist=" + solist +
                ", amountOfOperasPerYear=" + amountOfOperasPerYear +
                ", dataBegginingOfContract=" + dataBegginingOfContract +
                ", dataEndingOfContract=" + dataEndingOfContract +
                ", salaryAmount=" + salaryAmount +
                ", isHaveBonus=" + isHaveBonus +
                '}';
    }
}
