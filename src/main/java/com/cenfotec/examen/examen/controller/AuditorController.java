package com.cenfotec.examen.examen.controller;

import com.cenfotec.examen.examen.domain.Auditor;
import com.cenfotec.examen.examen.service.AuditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class AuditorController {
    @Autowired
    AuditorService auditorService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("auditor", auditorService.getAll());
        return "index";
    }
    @RequestMapping(value = "/agregarEntrada", method = RequestMethod.GET)
    public String navegarpaginaInsertar(Model model){
        model.addAttribute(new Auditor());
        return "agregarEntrada";
    }

    @RequestMapping(value = "/agregarEntrada", method = RequestMethod.POST)
    public String accionPaginaInsertar(Auditor journal, BindingResult result, Model model){
        auditorService.saveAuditor(journal);
        return "exito";
    }
    @RequestMapping("/verAuditores")
    public String verAuditores(Model model){
        model.addAttribute("auditor", auditorService.getAll());
        return "verAuditores";
    }
    @RequestMapping(value = "/editar/{id}")
    public String irAEditar(Model model, @PathVariable int id) {
        Optional<Auditor> auditorToEdit = auditorService.getById(id);
        if (auditorToEdit.isPresent()){
            model.addAttribute("auditorToEdit", auditorToEdit);
            return "editAuditor";
        } else {
            return "notFound";
        }
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.POST)
    public String guardarCambios(Auditor auditor, BindingResult result,Model model,
                                 @PathVariable int id) {

        //podria ir en el service.
        auditorService.updateAuditor(auditor);
        return "exito";
    }
}
