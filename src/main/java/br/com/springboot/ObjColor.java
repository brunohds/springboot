package br.com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
@RequestMapping("/palavra")
public class ObjColor {
    private String word;

    @GetMapping(path ="/{word}")
    public String listar(@PathVariable String word){
        word=word.toUpperCase(Locale.ROOT);
        String cor = "COR";
        String objeto = "OBJETO";
        switch (word){
            case "AMARELO":
            case" VERMELHO":
            case "BRANCO":
            case "PRETO":
            case "AZUL":
            case "CINZA":
            case "VERDE":
                return cor;
            default: return objeto;

        }
    }
}
