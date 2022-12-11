package com.orient.crudspring.service.impl;

import com.orient.crudspring.model.Account;
import com.orient.crudspring.repository.AccountRepository;
import com.orient.crudspring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account creat(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void update(@PathVariable Long id,@RequestBody Account account) {

        Account account1= accountRepository.getReferenceById(id);
        account1.setUsername(account.getUsername());
        account1.setPassword(account.getPassword());;
        account1.setFirstName(account.getFirstName());;
        account1.setLastName(account.getLastName());
        account1.setEmail(account.getEmail());

        accountRepository.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);

    }

    @Override
    public void deleteall() {
        accountRepository.deleteAll();
    }
}
