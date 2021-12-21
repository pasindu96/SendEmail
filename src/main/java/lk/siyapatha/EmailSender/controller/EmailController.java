package lk.siyapatha.EmailSender.controller;


import lk.siyapatha.EmailSender.entity.ContactUs;
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
    public String SendEmail(@RequestBody ContactUs email){
        System.out.println(email);
//        System.out.println("Result : " + emailService.SendEmail());
        return "Received !";
    }
}
