package com.micgogi.azureaddemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micgogi
 * on 4/13/2021  3:58 PM
 * Rahul Gogyani
 */
@RestController
public class HelloController {
    @GetMapping("/account")
    public Authentication getAccount() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}

