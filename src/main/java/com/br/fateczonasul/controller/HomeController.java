package com.br.fateczonasul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/paginainicial")
    public String paginainicial() {
        return "paginainicial";
    }

    @GetMapping("/ArteContemporanea")
    public String ArteContemporanea() {
        return "ArteContemporanea";
    }

    @GetMapping("/Impressionismo")
    public String Impressionismo() {
        return "Impressionismo";
    }

    @GetMapping("/Renascimento")
    public String Renascimento() {
        return "Renascimento";
    }
}
