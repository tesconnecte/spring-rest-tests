package com.test.recruitment.controller.impl;

import com.test.recruitment.controller.TransactionController;
import com.test.recruitment.exception.CustomHttpException;
import com.test.recruitment.json.TransactionResponse;
import com.test.recruitment.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation of {@link TransactionController}
 */
@RestController
public class TransactionControllerImpl implements TransactionController {

    private final TransactionService transactionService;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public TransactionControllerImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public Page<TransactionResponse> getTransactionsByAccount(String accountId, Pageable pageable) {

        Page<TransactionResponse> page = transactionService.getTransactionsByAccount(accountId, pageable);

        if (null == page || page.getTotalElements() == 0) {
            log.debug("Cannot find transaction for account {}", accountId);
            throw new CustomHttpException(HttpStatus.NO_CONTENT);
        }

        return page;
    }

}
