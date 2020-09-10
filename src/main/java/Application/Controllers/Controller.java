package Application.Controllers;

import Application.Citizen;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Controller {

    @PostMapping("/validateCitizen")
    public String submitCitizen(@Valid Citizen citizen) {

        return citizen.toString();
    }
}
