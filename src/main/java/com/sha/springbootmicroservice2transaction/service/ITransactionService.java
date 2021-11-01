package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    Transaction getTransaction(Long transactionId);

    List<Transaction> getAllTransactionsOfUser(Long userId);
}
