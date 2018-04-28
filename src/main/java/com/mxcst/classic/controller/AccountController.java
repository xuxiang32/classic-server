package com.mxcst.classic.controller;

import com.mxcst.classic.entity.Account;
import com.mxcst.classic.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "account")
public interface AccountController {
    /**
     * 列出玩家
     * @return
     */
    @RequestMapping(value = "/listPlayers", method = RequestMethod.POST)
    Result selectPlayers();

    /**
     * 查询是否有重复名称
     * @return
     */
    Integer selecSameName(String username);

    /**
     * 添加玩家
     * @return
     */
    @RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
    @Transactional
    Result addPlayer(@RequestBody Account account);

    /**
     * 删除玩家
     * @param account
     * @return
     */
    @RequestMapping(value = "/deletePlayer", method = RequestMethod.POST)
    @Transactional
    Result deletePlayer(@RequestBody Account account);

    /**
     * 更改密码
     * @param account
     * @return
     */
    @RequestMapping(value = "/updatePsw", method = RequestMethod.POST)
    @Transactional
    Result updatePsw(@RequestBody Account account);
}
