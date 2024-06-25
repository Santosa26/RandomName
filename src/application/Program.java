package application;

import java.util.Scanner;

import entities.NomeCompleto;
import entities.NomeGerador;
import entities.SobrenomeGerador;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos nomes completos você quer gerar?");
        int quantidade = scanner.nextInt();

        NomeGerador nomeGerador = new NomeGerador();
        SobrenomeGerador sobrenomeGerador = new SobrenomeGerador();

        for (int i = 0; i < quantidade; i++) {
            String nome = nomeGerador.gerarNome();
            String sobrenome = sobrenomeGerador.gerarSobrenome();
            NomeCompleto nomeCompleto = new NomeCompleto(nome, sobrenome);
            System.out.println(nomeCompleto);
        }

        scanner.close();
    }
}
