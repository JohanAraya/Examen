package com.cenfotec.examen.examen.controller;

import com.cenfotec.examen.examen.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JournalController {
    @Autowired
    JournalService journalService;
    /*
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", journalService.getAll());
        return "index";
    }
    @RequestMapping(value = "/agregarEntrada", method = RequestMethod.GET)
    public String navegarpaginaInsertar(Model model){
        model.addAttribute(new Journal());
        return "agregarEntrada";
    }

    @RequestMapping(value = "/agregarEntrada", method = RequestMethod.POST)
    public String accionPaginaInsertar(Journal journal, BindingResult result, Model model){
        journal.setCreated(Date.from(Instant.now()));
        journalService.saveJournal(journal);
        return "exito";
    }

     */
}
