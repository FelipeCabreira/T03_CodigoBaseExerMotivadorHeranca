import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0,false,1));
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0,false,2));
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0,true,2));
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0,false,1));
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0,true,3));
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0,true,1));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        System.out.println("["+matricula+"]");
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}