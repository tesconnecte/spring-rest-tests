package com.test.recruitment.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Account entity
 */
public class Account implements Serializable {

    private static final long serialVersionUID = -3548441891975414771L;

    private String id;

    private String number;

    private String type;

    private BigDecimal balance;

    private Date creationDate;

    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return isActive() == account.isActive() && Objects.equals(getId(), account.getId()) && Objects.equals(getNumber(), account.getNumber()) && Objects.equals(getType(), account.getType()) && Objects.equals(getBalance(), account.getBalance()) && Objects.equals(getCreationDate(), account.getCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), getType(), getBalance(), getCreationDate(), isActive());
    }

    @Override
    public String toString() {
        return "Account{" +
            "id='" + id + '\'' +
            ", number='" + number + '\'' +
            ", type='" + type + '\'' +
            ", balance=" + balance +
            ", creationDate=" + creationDate +
            ", isActive=" + isActive +
            '}';
    }

}
