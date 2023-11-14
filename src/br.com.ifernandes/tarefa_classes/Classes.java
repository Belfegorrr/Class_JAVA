package br.com.ifernandes;

/**
 * @author iago.fernandes
 */
public class Classes {
    public static void main(String args[]) {
        System.out.println("Olá Novo Cliente!");

        Cliente cliente = new Cliente();

        cliente.setNome("Iago");
        cliente.setPassword(16519);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getPassword());
    }
}