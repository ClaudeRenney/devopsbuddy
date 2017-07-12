package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Claude on 7/10/17.
 */
@Controller
public class CopyController {
    @RequestMapping("/about")
    public String about(){
        return "copy/about";
    }
}
