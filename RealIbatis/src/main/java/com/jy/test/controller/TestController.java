package com.jy.test.controller;

import com.jy.test.service.TestService;
import com.jy.test.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestServiceImpl service;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", service.selBoard());
        return "list";
    }
}
