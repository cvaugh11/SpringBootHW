package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.Date;
import java.util.*;

@Controller
public class controller {
    @RequestMapping("")
    public String index() {
        return "index.html";
    }

    @RequestMapping("registerForm.html")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
         
        List<String> listProfession = Arrays.asList("Developer", "QA", "ScrumMaster");
        model.addAttribute("listProfession", listProfession);
         
        return "registerForm.html";
    }
  @PostMapping("registerForm.html")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success.html";
    }
 

