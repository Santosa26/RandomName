package entities;

import java.util.Random;

public class SobrenomeGerador {
    private String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa", "Rodrigues", "Almeida", "Nascimento", "Lima"};

    public String gerarSobrenome() {
        Random random = new Random();
        int index = random.nextInt(sobrenomes.length);
        return sobrenomes[index];
    }
}
