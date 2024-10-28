package br.com.spring01.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controle {
    
    @GetMapping("")    
    public String mensagem() {
        return "Hello World";
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Sejam bem vindo(a)";
    }
    
    
    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Sejam bem vindo(a) " + nome;
    }
}
