package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.Transaction;
import com.sha.springbootmicroservice2transaction.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService{

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public Transaction getTransaction(Long transactionId){
        return transactionRepository.getById(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactionsOfUser(Long userId){
        return transactionRepository.findAllByUserId(userId);
    }
}
