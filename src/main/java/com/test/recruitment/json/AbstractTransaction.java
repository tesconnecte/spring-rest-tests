package com.test.recruitment.json;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Abstract transaction json representation
 */
public abstract class AbstractTransaction implements Serializable {

    private static final long serialVersionUID = 7866293071140304316L;

    @NotNull
    private String number;

    @NotNull
    private BigDecimal balance;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
        if (!(o instanceof AbstractTransaction)) return false;
        AbstractTransaction that = (AbstractTransaction) o;
        return getNumber().equals(that.getNumber()) && getBalance().equals(that.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getBalance());
    }

    @Override
    public String toString() {
        return "AbstractTransaction{number='" + number + '\'' + ", balance=" + balance + '}';
    }

}
