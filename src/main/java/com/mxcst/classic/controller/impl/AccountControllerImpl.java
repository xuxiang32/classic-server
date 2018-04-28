package com.mxcst.classic.controller.impl;

import com.mxcst.classic.controller.AccountController;
import com.mxcst.classic.entity.Account;
import com.mxcst.classic.mapper.AccountMapper;
import com.mxcst.classic.utils.Result;
import com.mxcst.classic.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class AccountControllerImpl implements AccountController {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Result selectPlayers() {
        List list = accountMapper.selectPlayers();
        return ResultUtil.success(list);
    }

    @Override
    public Integer selecSameName(String username) {
        Integer count = accountMapper.selectSameName(username);
        return count;
    }

    @Override
    public Result addPlayer(@RequestBody Account account) {
        String username = account.getUsername();
        Integer count = this.selecSameName(username);
        if (count > 0) {
            return ResultUtil.error(200, "用户名重复");
        } else {
            Integer result = accountMapper.insertPlayer(account);
            if(result == 1){
                return ResultUtil.success("添加成功");
            } else {
                return ResultUtil.error(200, "未知错误");
            }
        }
    }

    @Override
    public Result deletePlayer(@RequestBody Account account) {
        Integer id = account.getId();
        Integer result = accountMapper.deleteByPrimaryKey(id);
        if(result == 1){
            return ResultUtil.success("删除成功");
        } else {
            return ResultUtil.error(500, "未知错误");
        }
    }

    @Override
    public Result updatePsw(@RequestBody Account account) {
        Integer result = accountMapper.updatePsw(account);
        if(result == 1){
            return ResultUtil.success("修改成功");
        } else {
            return ResultUtil.error(500, "未知错误");
        }
    }
}
