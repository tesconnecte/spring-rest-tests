package com.test.recruitment.tests;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Account test
 */
public class AdminTransactionTest extends AbstractTest {

    @Test
    public void createTransaction() throws Exception {
        String request = getRequest("createOk");

        mockMvc.perform(
                        post("/accounts/1/transactions")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isCreated());
    }

    @Test
    public void createTransactionBadRequest() throws Exception {
        String request = getRequest("createBadRequest");

        mockMvc.perform(
                        post("/accounts/1/transactions")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void updateTransaction() throws Exception {
        String request = getRequest("updateOk");

        mockMvc.perform(
                        put("/accounts/1/transactions/3")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isNoContent());
    }

    @Test
    public void updateTransactionNotBelongingToTheAccount() throws Exception {
        String request = getRequest("updateOk");

        mockMvc.perform(
                        put("/accounts/2/transactions/3")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isForbidden());
    }

    @Test
    public void updateNonExistingTransaction() throws Exception {
        String request = getRequest("updateOk");

        mockMvc.perform(
                        put("/accounts/1/transactions/8")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isNotFound());
    }

    @Test
    public void updateTransactionBadRequest() throws Exception {
        String request = "test";

        mockMvc.perform(
                        put("/accounts/1/transactions/3")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(request))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void deleteTransaction() throws Exception {
        mockMvc.perform(get("/accounts/1/transactions/remove/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    public void deleteTransactionNotBelongingToTheAccount() throws Exception {
        mockMvc.perform(get("/accounts/2/transactions/remove/1"))
                .andExpect(status().isForbidden());
    }

    @Test
    public void deleteNonExistingTransaction() throws Exception {
        mockMvc.perform(get("/accounts/1/transactions/99"))
                .andExpect(status().isNotFound());
    }

    /**
     * Get json request from test file
     *
     * @param name the filename
     * @return the request
     */
    private String getRequest(String name) throws IOException {

        StringWriter writer = new StringWriter();

        IOUtils.copy(
                Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResourceAsStream("json/" + name + ".json")),
                writer,
                Charset.defaultCharset()
        );

        return writer.toString();
    }

}
