package br.com.ifernandes;

/**
 * @author iago.fernandes
 */
public class Cliente {
    public int password;
    public String nome;

    /* metódos para nome */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param nome
     */

    public void imprimirNome(String nome) {
        System.out.println(this.nome);
    }


    /* metódos para password */

    public int getPassword() {
        return this.password;
    }

    public int setPassword(String nome) {
       return this.password = password;
    }
    public int retornarPassword() { return 250634; }
}
