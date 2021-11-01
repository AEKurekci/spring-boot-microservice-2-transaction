package com.sha.springbootmicroservice2transaction.controller;

import com.sha.springbootmicroservice2transaction.model.Transaction;
import com.sha.springbootmicroservice2transaction.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @PostMapping // POST -> api/product
    public ResponseEntity<?>saveTransaction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @GetMapping("{userId}") // GET -> api/transaction/userId
    public ResponseEntity<?> getAllTransactions(@PathVariable Long userId){
        return new ResponseEntity<>(transactionService.getAllTransactionsOfUser(userId), HttpStatus.OK);
    }

    @DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransactionById(@PathVariable Long transactionId){
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
