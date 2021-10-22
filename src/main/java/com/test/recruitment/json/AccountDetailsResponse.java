package com.test.recruitment.json;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Account details json representation
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AccountDetailsResponse extends AccountResponse implements Serializable {

    private static final long serialVersionUID = -6427772324577115079L;

    @NotNull
    private Date creationDate;

    @NotNull
    private boolean active;

}
