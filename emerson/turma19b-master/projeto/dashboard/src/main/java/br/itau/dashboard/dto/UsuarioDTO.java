package br.itau.dashboard.dto;

import br.itau.dashboard.model.Usuario;

public class UsuarioDTO {
    private String nome;
    private String email;

    public UsuarioDTO(Usuario user){
        this.nome = user.getNome();
        this.email = user.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
}
