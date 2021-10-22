package com.test.recruitment.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Transaction entity
 */
@Data
public class Transaction implements Serializable {

    private static final long serialVersionUID = 706690724306325415L;

    private String id;

    private String accountId;

    private String number;

    private BigDecimal balance;

}
