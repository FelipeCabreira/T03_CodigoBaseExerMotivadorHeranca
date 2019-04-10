package ExerciciosHeranca;

import java.util.*;

public class Economy extends Passagem {

    public Economy(String cpf, String nome, String origem, String destino, Date horario, String assento, Double custo) {
        super(cpf, nome, origem, destino, horario, assento, custo);
    }

    @Override
    public double custoBagagem(int quantidade, double[] pesos) {
        double custoAnterio = super.custoBagagem(quantidade, pesos);
        double adicionalCobrado = 10 * quantidade;
        return custoAnterio + adicionalCobrado;
    }

}