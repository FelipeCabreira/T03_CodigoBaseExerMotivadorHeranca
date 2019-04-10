public class Funcionario {
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private boolean areaDeRisco;
    private int tipoPesquisador;

    public Funcionario(String matricula, String nome, double salarioBruto, boolean areaDeRisco, int tipoPesquisador) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.areaDeRisco = areaDeRisco;
        this.tipoPesquisador = tipoPesquisador;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getINSS() {
        if (areaDeRisco == true) {
            double resultadoValor;
            resultadoValor = salarioBruto * 0.25;
            this.validaTipo(resultadoValor);
            return resultadoValor;
        } else {
            return salarioBruto * 0.1;
        }

    }

    public double validaTipo(double resultado) {
        switch (tipoPesquisador) {
        case 1:
            return resultado * 0.05;

        case 2:
            return resultado * 0.1;

        case 3:
            return resultado * 0.2;

        default:
            return -1;
        }
    }

    public double getImpRenda() {
        if (salarioBruto <= LIM_ISENCAO_IR) {
            // SALARIO LIMPO SEM DESCONTO
            return 0.0;
        } else {
            double aux = salarioBruto - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            // IMPORTO DE RENDA LIMPO TIRANDO 20% PORQ EXCEDE O LIMITE
            return ir;
        }
    }

    public double getSalarioLiquido() {
        return salarioBruto - getINSS() - getImpRenda();
    }
}