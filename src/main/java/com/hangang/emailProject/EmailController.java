package com.hangang.emailProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/emailForm")
    public String emailForm(){
        return "emailForm";
    }

    @PostMapping("/send-email")
    public String sendEmail(@RequestParam String to,
                            @RequestParam String subject,
                            @RequestParam String body) {
        emailService.sendEmail(to, subject, body);
        System.out.println("이메일이 전송되었습니다.");
        return "redirect:/";
    }
}