package lk.siyapatha.EmailSender.controller;


import lk.siyapatha.EmailSender.entity.ContactUs;
import lk.siyapatha.EmailSender.entity.Result;
import lk.siyapatha.EmailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "API/rebornit")
public class EmailController {

    @Autowired
    private EmailService emailService;


    @PostMapping(value = "/contactus", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result SendEmail(@RequestBody ContactUs contactUs){
        return emailService.SendEmail(contactUs);
    }
}
