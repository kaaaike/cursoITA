package org.excecoes;

public class Principal {

    public static void main(String[] args) {
        a(100);
    }

    public static void a(int i) {
        System.out.println("Executando a() com "+i);
        try {
            b(100);
        } catch (Exception e) {
            System.out.println("Tratando a exceção: "+e.getMessage());
        }
    }

    public static void b(int i) throws Exception {
        System.out.println("Executando b() com "+i);
        throw new Exception("Mensagem de ERROR!");
    }
}
