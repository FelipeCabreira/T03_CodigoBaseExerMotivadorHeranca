package ExerciciosHeranca;

import java.util.*;

public class Passagem {
    private String cpf;
    private String nome;
    private String origem;
    private String destino;
    private Date horario;
    private String assento;
    private Double custo;

    public Passagem(String cpf, String nome, String origem, String destino, Date horario, String assento,
            Double custo) {
        this.cpf = cpf;
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.horario = horario;
        this.assento = assento;
        this.custo = custo;
    }

    public double custoBagagem(int quantidade, double[] pesos) {
        double retornoCusto = 0;
        for(int i = 0; i < quantidade; i++) {
            retornoCusto += pesos[i] * 0.5;
        }
        return retornoCusto;
    }


}