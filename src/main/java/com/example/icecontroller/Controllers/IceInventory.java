package com.example.icecontroller.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IceInventory
{
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
}