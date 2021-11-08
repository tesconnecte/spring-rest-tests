package com.test.recruitment.dao.impl;

import com.test.recruitment.dao.TransactionRepository;
import com.test.recruitment.entity.Transaction;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of {@link TransactionRepository}
 */
@Repository
public class TransactionRepositoryImpl implements TransactionRepository, InitializingBean {

    private List<Transaction> transactions;

    @Override
    public void afterPropertiesSet() throws Exception {

        transactions = new ArrayList<>();

        {
            Transaction transaction = new Transaction();
            transaction.setAccountId("1");
            transaction.setBalance(BigDecimal.valueOf(42.12));
            transaction.setId("1");
            transaction.setNumber("12151885120");
            transactions.add(transaction);
        }
        {
            Transaction transaction = new Transaction();
            transaction.setAccountId("1");
            transaction.setBalance(BigDecimal.valueOf(456.00));
            transaction.setId("2");
            transaction.setNumber("12151885121");
            transactions.add(transaction);
        }
        {
            Transaction transaction = new Transaction();
            transaction.setAccountId("1");
            transaction.setBalance(BigDecimal.valueOf(-12.12));
            transaction.setId("3");
            transaction.setNumber("12151885122");
            transactions.add(transaction);
        }
    }

    @Override
    public Transaction findById(String id) {
        return transactions.stream()
            .filter(transaction -> transaction.getId().equals(id))
            .findFirst().orElse(null);
    }
    
    

    @Override
    public Page<Transaction> getTransactionsByAccount(String accountId, Pageable pageable) {
        return new PageImpl<>(transactions.stream()
            .filter(t -> t.getAccountId().equals(accountId))
            .collect(Collectors.toList()));
    }

    @Override
    public Transaction removeTransactionById(String id) {
        Transaction transactionToDelete = this.findById(id);
        if(transactionToDelete != null){
            this.transactions.remove(transactionToDelete);
        }        
        return transactionToDelete;
    }

}
