package ExerciciosHeranca;

import java.util.*;

public class Aeroporto {
    private String cidade;
    private int codigo;

    public Aeroporto(String cidade, int codigo) {
        this.cidade = cidade;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCidade() {
        return cidade;
    }

}