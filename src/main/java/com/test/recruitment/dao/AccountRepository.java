package com.test.recruitment.dao;

import com.test.recruitment.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Account repository
 */
public interface AccountRepository {

    /**
     * Get account by user
     *
     * @param pageable the pageable information
     * @return the account list
     */
    Page<Account> findAll(Pageable pageable);

    /**
     * Get account
     *
     * @param accountId the account id
     * @return an account if it exists
     */
    Optional<Account> findById(String accountId);

    /**
     * Check if an account exists
     *
     * @param accountId the account id
     * @return true if the account exists
     */
    boolean exists(String accountId);

}
