package com.test.recruitment.controller.impl;

import com.test.recruitment.controller.AccountController;
import com.test.recruitment.exception.CustomHttpException;
import com.test.recruitment.json.AccountDetailsResponse;
import com.test.recruitment.json.AccountResponse;
import com.test.recruitment.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation of {@link AccountController}
 */
@RestController
public class AccountControllerImpl implements AccountController {

    private final AccountService accountService;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public AccountControllerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Page<AccountResponse> getAccounts(Pageable pageable) {

        Page<AccountResponse> page = accountService.getAccounts(pageable);

        if (null == page || page.getTotalElements() == 0) {
            log.debug("Cannot find account");
            throw new CustomHttpException(HttpStatus.NO_CONTENT);
        }

        return page;
    }

    @Override
    public AccountDetailsResponse getAccountDetails(String accountId) {
        return accountService.getAccountDetails(accountId);
    }

}
