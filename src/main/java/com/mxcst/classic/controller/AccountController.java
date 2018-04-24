package com.mxcst.classic.controller;

import com.mxcst.classic.entity.Account;
import com.mxcst.classic.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "account")
public interface AccountController {
    @RequestMapping(value = "/listPlayers", method = RequestMethod.POST)
    Result selectPlayers();
}
