package com.gabriel.gerador_de_senhas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

  @GetMapping("/{tamanho}")
  public String gerarSenha(@PathVariable int tamanho) {
    try {
      Senha senha = new Senha(tamanho);
      return senha.gerarSenha();
    }catch (RuntimeException ex) {
      return ex.getMessage();
    }
  }
}
