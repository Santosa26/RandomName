package entities;

import java.util.Random;

public class NomeGerador {
    private String[] nomes = {"Ana", "João", "Maria", "Pedro", "Paula", "Lucas", "Fernanda", "Carlos", "Mariana", "Bruno"};

    public String gerarNome() {
        Random random = new Random();
        int index = random.nextInt(nomes.length);
        return nomes[index];
    }
}
