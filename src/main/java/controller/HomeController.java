package org.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class HomeController {
   @GetMapping("/")
   private String index(Model model) {
      model.addAttribute("message", "Hello World !!");
      return "index";
   }
}