package mx.edu.utez.sda.springmvc.control;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/peliculas")
public class ControlPeliculas {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @Secured({"ROLE_RECE", "ROLE_ADUL", "ROLE_INF"})
    public String index(){
        return "peliculas";
    }

    @RequestMapping(value = { "/acción", "/terror", "/comedia"}, method = RequestMethod.GET)
    @Secured("ROLE_ADUL")
    public String adultos() {
        return "peliculas";
    }

    @RequestMapping(value = {"/infantil", "/aventura", "/numeros"}, method = RequestMethod.GET)
    @Secured("ROLE_INF")
    public String infantil(){
        return "peliculas";
    }
}
