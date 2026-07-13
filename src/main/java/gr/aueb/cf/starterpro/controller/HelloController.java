package gr.aueb.cf.starterpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller                                                  // The controller sends HTML pages. Meaning of @controller.
@RequestMapping("/starter")                                  // The "/starter" means: in relation to the base URL. localhost:8080/starter/hello. It is a base path to the controller.
public class HelloController {

    @GetMapping("/hello")                                    // It means that this method provides services only for "get-type" requests at the localhost:8080/starter/hello".
    public String hello(Model model) {                       // Model = spring - interface as "transport-vehicle" of data to the web page! Controller = background code. Every page is controlled by a controller! The controller returns the page and implements the data in it.
        model.addAttribute("message", "Hello World!");       // We give a nickname -> "message" of data (tagging) and after that this message becomes accessible through the page "${message}". The data that it carries can be anything! Data ("Hello World!") -> called presentational data.
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "username", defaultValue = "Guest") String givenName,
                          Model model) {
        model.addAttribute("name", givenName);
        return "welcome";
    }
}
