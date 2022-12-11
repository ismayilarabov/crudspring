package com.orient.crudspring.controller;


import com.orient.crudspring.model.Account;
import com.orient.crudspring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("app")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/accounts")

    public List<Account> getAll(){

       return accountService.findAll();

    }

    @GetMapping("/account/{id}")
    public Account getById(@PathVariable Long id){

        Account account = accountService.findById(id);

        return account;
    }

    @PostMapping ("/creatAccount")
    public Account creat(@RequestBody Account account){

        Account account1  = accountService.creat(account);

        return account1;
    }
    @PutMapping("update/{id}")
    public void update(@PathVariable Long id, @RequestBody Account account){
         accountService.update(id, account);

    }

    @DeleteMapping("delete/{id}")
    public  void delete(@PathVariable  Long id){
        accountService.delete(id);
    }

    @DeleteMapping("deleteall")
    public void deleteall(){
        accountService.deleteall();
    }
}
