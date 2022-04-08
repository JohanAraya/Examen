package com.cenfotec.examen.examen.controller;

import com.cenfotec.examen.examen.domain.Cliente;
import com.cenfotec.examen.examen.service.ClienteService;
import com.cenfotec.examen.examen.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @Autowired
    PersonaService personaService;


    @RequestMapping(value = "/registrarCliente", method = RequestMethod.GET)
    public String navegarpaginaInsertarCliente(Model model){
        model.addAttribute(new Cliente());
        return "registrarCliente";
    }

    @RequestMapping(value = "/registrarCliente", method = RequestMethod.POST)
    public String accionPaginaInsertarCliente(Cliente cliente, BindingResult result, Model model){
        clienteService.saveCliente(cliente);
        return "exito";
    }

    @RequestMapping("/verClientes")
    public String verClientes(Model model){

        model.addAttribute("cliente", clienteService.getAll());
        model.addAttribute("persona", personaService.getAll());
        return "verClientes";
    }
    /*
    @RequestMapping(value = "/editar/{id}")
    public String irAEditarCliente(Model model, @PathVariable int id) {
        Optional<Cliente> clienteToEdit = clienteService.getById(id);
        if (clienteToEdit.isPresent()){
            model.addAttribute("clienteToEdit", clienteToEdit);
            return "editCliente";
        } else {
            return "notFound";
        }
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.POST)
    public String guardarCambiosCliente(Cliente cliente, BindingResult result,Model model,
                                 @PathVariable int id) {

        //podria ir en el service.
        clienteService.updateCliente(cliente);
        return "exito";
    }
*/

}
