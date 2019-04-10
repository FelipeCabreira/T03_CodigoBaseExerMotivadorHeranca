public class FuncionarioAreaRisco extends Funcionario {

    public FuncionarioAreaRisco(String matricula, String nome, double salarioBruto, boolean areaDeRisco,
            int tipoPesquisador) {
        super(matricula, nome, salarioBruto, areaDeRisco, tipoPesquisador);
        //TODO: LEMBRETE ############# ACESSO DAS VARIAVEIS APENAS POR METODOS DENTRO DO PAI ( VARIAVEIS PRIVATE NO PAI ) - PARA PROTEGER AS VARIAVEIS DO PAI ###############
    }


    @Override
    public double getImpRenda() {
        if (getSalarioBruto() <= LIM_ISENCAO_IR) {
            // SALARIO LIMPO SEM DESCONTO
            return 0.0;
        } else {
            double aux = getSalarioBruto() - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            // IMPORTO DE RENDA LIMPO TIRANDO 20% PORQ EXCEDE O LIMITE
            return ir;
        }
    }
}