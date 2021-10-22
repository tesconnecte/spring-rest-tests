package com.test.recruitment.json;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Account json representation
 */
@Data
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

}
