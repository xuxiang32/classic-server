package com.mxcst.classic.controller.impl;

import com.mxcst.classic.controller.AccountController;
import com.mxcst.classic.entity.Account;
import com.mxcst.classic.mapper.AccountMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AccountControllerImpl implements AccountController{
    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> selectPlayers() {
        List list = accountMapper.selectPlayers();
        return list;
    }
}
