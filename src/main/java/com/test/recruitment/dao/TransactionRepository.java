package com.test.recruitment.dao;

import com.test.recruitment.entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Transaction repository
 */
public interface TransactionRepository {

    /**
     * Get transaction by Id
     *
     * @param id id of the transaction to get
     * @return the transaction corresponding to the given id or null
     */
    Transaction findById(String id);

    /**
     * Get transactions by account
     *
     * @param accountId the account id
     * @param pageable  the pageable information
     * @return the transaction list
     */
    Page<Transaction> getTransactionsByAccount(String accountId, Pageable pageable);

}
