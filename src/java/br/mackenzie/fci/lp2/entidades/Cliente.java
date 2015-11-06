package br.mackenzie.fci.lp2.entidades;

/**
 *
 * @author 41381467
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, String endereco, String email, String telefone, String cpf ) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
