package br.com.zedaniel06.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    /*
    Métodos HTTP
     * GET - Busca
     * POST - Adiciona
     * PUT - Editar
     * DELETE - Remover
     * PATCH - Alterar apenas uma parte
     */
    @GetMapping("/primeiroMetodo/")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
