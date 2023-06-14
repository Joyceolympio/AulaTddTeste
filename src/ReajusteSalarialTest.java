import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteSalarialTest {

    @Test
    public void reajusteDeveriaSerDezPorCento(){

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial();
        Funcionario funcionario = new Funcionario("Joy", new BigDecimal("1000.00"));

        reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());


    }

}
