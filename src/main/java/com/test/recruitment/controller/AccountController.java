package com.test.recruitment.controller;

import com.test.recruitment.json.AccountDetailsResponse;
import com.test.recruitment.json.AccountResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Account controller
 */
@RequestMapping(value = "/accounts")
public interface AccountController {

    /**
     * Get account list
     *
     * @param pageable the pageable information
     * @return the account list
     */
    @GetMapping
    ResponseEntity<Page<AccountResponse>> getAccounts(@PageableDefault Pageable pageable);

    /**
     * Get account details
     *
     * @param accountId the account id
     * @return the account details
     */
    @GetMapping("/{accountId}")
    ResponseEntity<AccountDetailsResponse> getAccountDetails(@PathVariable String accountId);

}
