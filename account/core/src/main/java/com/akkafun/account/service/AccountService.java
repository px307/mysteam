package com.akkafun.account.service;

import com.akkafun.account.dao.AccountFlowRepository;
import com.akkafun.account.dao.AccountRepository;
import com.akkafun.account.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liubin on 2016/4/26.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountFlowRepository accountFlowRepository;

    @Transactional
    public void initAccount(Long userId) {
        Account account = new Account();
        account.setBalance(0L);
        account.setUserId(userId);
        accountRepository.save(account);
    }
}