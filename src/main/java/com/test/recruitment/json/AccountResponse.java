package com.test.recruitment.json;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Account json representation
 */
public class AccountResponse implements Serializable {

    private static final long serialVersionUID = 1311670657098492357L;

    @NotNull
    private String id;

    @NotNull
    private String number;

    @NotNull
    private String type;

    @NotNull
    private BigDecimal balance;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountResponse)) return false;
        AccountResponse that = (AccountResponse) o;
        return getId().equals(that.getId()) && getNumber().equals(that.getNumber()) && getType().equals(that.getType()) && getBalance().equals(that.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), getType(), getBalance());
    }

    @Override
    public String toString() {
        return "AccountResponse{" +
            "id='" + id + '\'' +
            ", number='" + number + '\'' +
            ", type='" + type + '\'' +
            ", balance=" + balance +
            '}';
    }

}
