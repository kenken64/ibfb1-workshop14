package sg.edu.nus.iss.app.workshop14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sg.edu.nus.iss.app.workshop14.models.Contact;
import sg.edu.nus.iss.app.workshop14.service.ContactsRedis;

@Controller
public class AddressBookController {
    @Autowired
    private ContactsRedis ctcRedisSvc;

    @GetMapping(path="/")
    public String contactForm(Model model){
        model.addAttribute("contact", new Contact());
        return "contact";
    }
}
