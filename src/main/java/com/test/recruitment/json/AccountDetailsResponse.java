package com.test.recruitment.json;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Account details json representation
 */
public class AccountDetailsResponse extends AccountResponse implements Serializable {

    private static final long serialVersionUID = -6427772324577115079L;

    @NotNull
    private Date creationDate;

    @NotNull
    private boolean active;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
