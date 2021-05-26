package example.emailSender.controllers;

import example.emailSender.model.MailModel;
import example.emailSender.service.EmailService;

import freemarker.template.TemplateException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("api/v1/send")
    public ResponseEntity<?> sendEmail(@RequestBody MailModel mailModel){
        try {
            emailService.sendEmail(mailModel);
            return ResponseEntity.ok().body(mailModel.toString());
        } catch (MessagingException | TemplateException | IOException e) {
            return ResponseEntity.ok().body(e.getMessage());
        }
    }
}