package com.cenfotec.examen.examen.controller;

import com.cenfotec.examen.examen.domain.Auditoria;
import com.cenfotec.examen.examen.service.ClienteService;
import com.cenfotec.examen.examen.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuditoriaController {
    @Autowired
    AuditoriaService auditoriaService;

    @Autowired
    ClienteService clienteService;


    @RequestMapping(value = "/registrarAuditoria", method = RequestMethod.GET)
    public String navegarpaginaInsertarAuditoria(Model model){
        model.addAttribute(new Auditoria());
        model.addAttribute("cliente", clienteService.getAll());
        return "registrarAuditoria";
    }

    @RequestMapping(value = "/registrarAuditoria", method = RequestMethod.POST)
    public String accionPaginaInsertarAuditoria(Auditoria auditoria, BindingResult result, Model model){
        model.addAttribute("auditoria", clienteService.getAll());
        auditoriaService.saveAuditoria(auditoria);
        return "exito";
    }

    @RequestMapping("/verAuditorias")
    public String verAuditorias(Model model){
        model.addAttribute("auditoria", auditoriaService.getAll());
        return "verAuditorias";
    }
    /*
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

     */
}
