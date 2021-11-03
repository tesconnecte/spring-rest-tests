package com.test.recruitment.json;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Transaction json representation
 */
public class TransactionResponse extends AbstractTransaction implements Serializable {

    private static final long serialVersionUID = -2371720864101586328L;

    @NotNull
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
