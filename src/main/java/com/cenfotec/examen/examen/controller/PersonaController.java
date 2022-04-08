package com.cenfotec.examen.examen.controller;

import com.cenfotec.examen.examen.domain.Persona;
import com.cenfotec.examen.examen.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @RequestMapping(value = "/registrarPersona", method = RequestMethod.GET)
    public String navegarpaginaInsertarPersona(Model model){
        model.addAttribute(new Persona());
        return "registrarPersona";
    }
    @RequestMapping(value = "/registrarPersona", method = RequestMethod.POST)
    public String accionPaginaInsertarPersona(Persona persona, BindingResult result, Model model){
        personaService.savePersona(persona);
        return "exito";
    }
    @RequestMapping(value = "/editarPersona/{id}")
    public String irAEditarPersona(Model model, @PathVariable int id) {
        Optional<Persona> personaToEdit = personaService.getById(id);
        if (personaToEdit.isPresent()){
            model.addAttribute("personaToEdit", personaToEdit);
            return "editPersona";
        } else {
            return "notFound";
        }
    }
    @RequestMapping(value = "/editarPersona/{id}", method = RequestMethod.POST)
    public String guardarCambiosPersona(Persona persona, BindingResult result,Model model,
                                 @PathVariable int id) {

        //podria ir en el service.
        personaService.updatePersona(persona);
        return "exito";
    }

    @RequestMapping(value = "/borrarPersona/{id}")
    public String borrarPersona(Model model, @PathVariable int id) {
        personaService.deletePersona(id);
        return "exito";
    }

}
