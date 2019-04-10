package ExerciciosHeranca;

import java.util.*;

public class Executive extends Passagem {
    private int milhas;
    public Executive(String cpf, String nome, String origem, String destino, Date horario, String assento, Double custo) {
        super(cpf, nome, origem, destino, horario, assento, custo);
        milhas = 0;
    }

    @Override
    public double custoBagagem(int quantidade, double[] pesos) {
        if(quantidade <= 2 ) {
            return 0.0;
        } else {
            double novoCusto = super.custoBagagem(quantidade - 2, pesos);
            milhas = milhas + (int)(novoCusto*0.1);
            return novoCusto;
        }
    }

    public int getMilhas(){
        return milhas;
    }

}