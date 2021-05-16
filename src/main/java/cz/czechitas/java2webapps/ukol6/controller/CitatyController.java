package cz.czechitas.java2webapps.ukol6.controller;

import cz.czechitas.java2webapps.ukol6.service.CitatyRepository;
import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

/**
 *
 */
@Controller
public class CitatyController {

    private final CitatyService citatyService;

    @Autowired
    public CitatyController(CitatyService citatyService) {
        this.citatyService = citatyService;
    }


    @GetMapping("/")
    public ModelAndView nahodnyCitat() {
        String vybranyCitat = citatyService.nahodnyCitat();
        ModelAndView modelAndView = new ModelAndView("citat");
        modelAndView.addObject("citat", vybranyCitat);
        return modelAndView;
    }
}
