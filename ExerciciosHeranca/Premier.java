package ExerciciosHeranca;

import java.util.*;

public class Premier extends Executive {

    public Premier(String cpf, String nome, String origem, String destino, Date horario, String assento, Double custo) {
        super(cpf, nome, origem, destino, horario, assento, custo);
    }

    @Override
    public int getMilhas() {
        return 0;
    }

}