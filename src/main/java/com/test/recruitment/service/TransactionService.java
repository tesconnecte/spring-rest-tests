package com.test.recruitment.service;

import com.test.recruitment.dao.TransactionRepository;
import com.test.recruitment.entity.Transaction;
import com.test.recruitment.exception.CustomHttpException;
import com.test.recruitment.json.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Transaction service
 */
@Service
public class TransactionService {

    private final AccountService accountService;

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(AccountService accountService,
                              TransactionRepository transactionRepository) {
        this.accountService = accountService;
        this.transactionRepository = transactionRepository;
    }

    /**
     * Get transactions by account
     *
     * @param accountId the account id
     * @param pageable  the pageable object
     * @return transaction list
     */
    public Page<TransactionResponse> getTransactionsByAccount(String accountId, Pageable pageable) {

        if (!accountService.isAccountExist(accountId)) {
            throw new CustomHttpException(HttpStatus.NOT_FOUND, "Account doesn't exist");
        }

        return new PageImpl<>(transactionRepository.getTransactionsByAccount(accountId, pageable)
            .getContent()
            .stream()
            .map(this::map)
            .collect(Collectors.toList()));
    }

    /**
     * Map {@link Transaction} to {@link TransactionResponse}
     *
     * @param transaction the transaction
     * @return transaction response
     */
    private TransactionResponse map(Transaction transaction) {

        TransactionResponse result = new TransactionResponse();
        result.setBalance(transaction.getBalance());
        result.setId(transaction.getId());
        result.setNumber(transaction.getNumber());

        return result;
    }

    
    public TransactionResponse removeAccountTransactionById(String transactionId) {
       return this.map(transactionRepository.removeTransactionById(transactionId));
        
    }
    

}
