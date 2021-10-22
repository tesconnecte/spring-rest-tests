package com.test.recruitment.controller.impl;

import com.test.recruitment.controller.AccountController;
import com.test.recruitment.json.AccountDetailsResponse;
import com.test.recruitment.json.AccountResponse;
import com.test.recruitment.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation of {@link AccountController}
 */
@Slf4j
@RestController
public class AccountControllerImpl implements AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountControllerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public ResponseEntity<Page<AccountResponse>> getAccounts(Pageable pageable) {

        Page<AccountResponse> page = accountService.getAccounts(pageable);

        if (null == page || page.getTotalElements() == 0) {
            log.debug("Cannot find account");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }

        return ResponseEntity.ok().body(page);
    }

    @Override
    public ResponseEntity<AccountDetailsResponse> getAccountDetails(String accountId) {
        return ResponseEntity.ok().body(accountService.getAccountDetails(accountId));
    }

}
