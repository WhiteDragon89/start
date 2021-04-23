package com.example.start.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import static com.sun.tools.attach.VirtualMachine.list;

@Controller
@RequestMapping("/board")
public class BoardController{

    @GetMapping("/list")
    public String list() {
        return "board/list";
        }
}
















