import java.math.BigDecimal;

public class ReajusteSalarial {

    public void reajusteSalarioFuncionario(Funcionario funcionario, Desempenho desempenho){

        if (desempenho == Desempenho.BOM){
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.10"));
            funcionario.reajusteSalario(reajuste);
        }else if (desempenho == Desempenho.A_DESEJAR){
            throw new IllegalArgumentException("Funcionário não pode receber reajuste, seu desempenho foi a desejar");
        }

    }

}
