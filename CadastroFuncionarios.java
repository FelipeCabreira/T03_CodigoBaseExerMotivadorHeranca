import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}