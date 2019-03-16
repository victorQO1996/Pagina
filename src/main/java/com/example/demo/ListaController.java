package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListaController {
    private List<String> citas = new ArrayList<>();

    @RequestMapping(path="/Examen")
    public String lista (Model model){

        model.addAttribute("lista", citas);
        return "Examen";
    }

    @PostMapping("/add")
    public String add(String nuevo){
        citas.add(nuevo +" ");
        return "redirect:/Examen";
    }

}