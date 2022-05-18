package mx.com.leonrv3.materialexamplespring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.com.leonrv3.materialexamplespring.service.HotDogServiceImpl;

@Controller
public class HotDogController {
    
    @Autowired
    HotDogServiceImpl hotDogServiceImpl;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("listaHotdogs", hotDogServiceImpl.listar());
        return "index";
    }
}
