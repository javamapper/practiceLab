package com.javamapper.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{

    @RequestMapping(value = "/error")
    public String error() {
        return "Request forwarded to error url- enable TRACE logging to verfiy";
        /**
         * logging.level.org.springframework=TRACE
		   logging.level.com=TRACE
         */
    }
}