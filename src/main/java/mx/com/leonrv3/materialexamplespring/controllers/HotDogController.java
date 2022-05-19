package mx.com.leonrv3.materialexamplespring.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import mx.com.leonrv3.materialexamplespring.domain.HotDog;
import mx.com.leonrv3.materialexamplespring.service.HotDogServiceImpl;
import reactor.core.publisher.Mono;

@Controller
public class HotDogController {

    

    @Autowired
    HotDogServiceImpl hotDogServiceImpl;

    @GetMapping("/")
    public String index(Model model) {

       
        List<HotDog> listaHotdogs = hotDogServiceImpl.listar();
        model.addAttribute("listaHotdogs", listaHotdogs);
        return "index";
    }
}
