package Application.Controllers;

import Application.Citizen;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class Controller {

    @PostMapping("/validateCitizen")

    @ResponseBody
    @RequestMapping(value = "/validateCitizen", headers = {
            "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public String submitCitizen(@Valid @RequestBody Citizen citizen) {

        return citizen.toString();
    }
}
