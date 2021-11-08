package com.test.recruitment.controller;

import com.test.recruitment.json.TransactionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Transaction controller
 */
@RequestMapping(value = "/accounts/{accountId}/transactions")
public interface TransactionController {

    /**
     * Get transaction list by account
     *
     * @param accountId the account id
     * @param pageable  the pageable information
     * @return the transaction list
     */
    @GetMapping
    Page<TransactionResponse> getTransactionsByAccount(@PathVariable String accountId, @PageableDefault Pageable pageable);

    @GetMapping("/remove/{transactionId}")
    TransactionResponse removeTransactionById(@PathVariable String transactionId);
    
    

}
