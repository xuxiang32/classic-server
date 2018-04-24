package com.mxcst.classic.controller.impl;

import com.mxcst.classic.controller.AccountController;
import com.mxcst.classic.mapper.AccountMapper;
import com.mxcst.classic.utils.Result;
import com.mxcst.classic.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class AccountControllerImpl implements AccountController{
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Result selectPlayers() {
        List list = accountMapper.selectPlayers();
        return ResultUtil.success(list);
    }
}
