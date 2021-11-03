package com.test.recruitment.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Transaction entity
 */
public class Transaction implements Serializable {

    private static final long serialVersionUID = 706690724306325415L;

    private String id;

    private String accountId;

    private String number;

    private BigDecimal balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

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
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getAccountId(), that.getAccountId()) && Objects.equals(getNumber(), that.getNumber()) && Objects.equals(getBalance(), that.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAccountId(), getNumber(), getBalance());
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "id='" + id + '\'' +
            ", accountId='" + accountId + '\'' +
            ", number='" + number + '\'' +
            ", balance=" + balance +
            '}';
    }

}
