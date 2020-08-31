package com.github.perscholas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @GetMapping(value = "/message-page")
    String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "helloworld";
    }
}