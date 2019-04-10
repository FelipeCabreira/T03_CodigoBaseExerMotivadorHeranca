import java.util.*;

public class Pesquisador extends Funcionario {
    private int categoria;
    private int salarioBruto;

    public Pesquisador(String matricula, String nome, double salarioBruto, boolean areaDeRisco, int tipoPesquisador,
            int categoria) {
        super(matricula, nome, salarioBruto, areaDeRisco, tipoPesquisador);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    
    @Override
    public double getSalarioLiquido() {
        double acrescimo = 1.05;
        if(categoria == 2) acrescimo = 1.1;
        if(categoria == 3) acrescimo = 1.2;
        return (getSalarioBruto() - getINSS() - getImpRenda()) * acrescimo;
    }
}