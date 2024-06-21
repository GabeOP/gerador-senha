package com.gabriel.gerador_de_senhas;

import java.util.Random;

public class Senha {

  private  int tamanho;
  private String senha = "";
  private String[] caracteresSenha = {
          "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
          "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "*",
          "_", "-", ".", "?"
  };
  private Random gerador = new Random();

  public Senha(int tamanho) {
    if(tamanho < 20) {
      throw new RuntimeException("Tamanho muito pequeno. Insira um valor maior ou igual a 20.");
    } else if(tamanho > 60) {
      throw new RuntimeException("Tamanho muito grande. Insira um valor menor ou igual a 60.");
    }
    this.tamanho = tamanho;
  }

  public String gerarSenha() {
    for(int i = 0; i < tamanho; i++) {
      int index = gerador.nextInt(caracteresSenha.length);

      StringBuilder sb = new StringBuilder(senha);
      sb.insert(0, caracteresSenha[index]);
      senha = sb.toString();
    }

    return senha;
  }

}
