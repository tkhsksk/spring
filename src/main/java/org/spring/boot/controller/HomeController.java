package org.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller

public class HomeController {

   @RequestMapping("/")
   private String index(Model model) {
      model.addAttribute("message", "Hello World !!");
      return "index";
   }
}