package com.test.recruitment.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Account entity
 */
@Data
public class Account implements Serializable {

    private static final long serialVersionUID = -3548441891975414771L;

    private String id;

    private String number;

    private String type;

    private BigDecimal balance;

    private Date creationDate;

    private boolean isActive;

}
