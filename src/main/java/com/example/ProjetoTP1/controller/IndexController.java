package com.example.ProjetoTP1.controller;

import com.example.ProjetoTP1.model.Numeros;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("soma")
    public String somaGet(){
        float a = 2;
        float b = 2;
        float resultado = a + b;
        String retorno =  String.format("O resultado de %f + %f é %f", a, b, resultado);
        return retorno;
    }

    @GetMapping("subtracao")
    public String subtracaoGet(){
        float a = 1;
        float b = 4;
        float resultado = a - b;
        String retorno =  String.format("O resultado de %f + %f é %f", a, b, resultado);
        return retorno;
    }

    @GetMapping("multiplicacao")
    public String multiplicacaoGet(){
        float a = 4;
        float b = 5;
        float resultado = a * b;
        String retorno =  String.format("O resultado de %f + %f é %f", a, b, resultado);
        return retorno;
    }

    @GetMapping("divisao")
    public String divisaoGet(){
        float a = 8;
        float b = 3;
        float resultado = a / b;
        String retorno =  String.format("O resultado de %f + %f é %f", a, b, resultado);
        return retorno;
    }
    @GetMapping("exponenciacao")
    public String exponenciacaoGet(){
        float a = 3;
        float b = 4;
        double resultado = Math.pow(a,b);
        String retorno =  String.format("O resultado de %f + %f é %f", a, b, resultado);
        return retorno;
    }


    @PostMapping("soma")
    public float soma(@RequestBody Numeros numeros){
        return numeros.soma() ;
    }

    @PostMapping("subtracao")
    public float subtracao(@RequestBody Numeros numeros){
        return numeros.subtracao() ;
    }

    @PostMapping("multiplicacao")
    public float multiplicacao(@RequestBody Numeros numeros){
        return numeros.multiplicacao() ;
    }

    @PostMapping("divisao")
    public float divisao(@RequestBody Numeros numeros){
        return numeros.divisao() ;
    }

    @PostMapping("exponenciacao")
    public float exponenciacao(@RequestBody Numeros numeros){
        return numeros.exponenciacao() ;
    }
}
