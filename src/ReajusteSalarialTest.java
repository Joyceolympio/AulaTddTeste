import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ReajusteSalarialTest {

    @Test
    public void reajusteDeveriaSerDezPorCento(){

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial();
        Funcionario funcionario = new Funcionario("Joy", new BigDecimal("1000.00"));

        reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerZero(){

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial();
        Funcionario funcionario = new Funcionario("Joy", new BigDecimal("1000.00"));
//
//        reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.A_DESEJAR);
//
//        assertEquals(new BigDecimal("1000.00"), funcionario.getSalario());

        assertThrows(IllegalArgumentException.class, () -> reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.A_DESEJAR));

//        try{
//            reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.A_DESEJAR);
//            fail("Não deu exception!");
//        } catch (Exception e){
//
//        }
    }

    @Test
    public void reajusteDeveriaSerZero1(){

        ReajusteSalarial reajusteSalarial = new ReajusteSalarial();
        Funcionario funcionario = new Funcionario("Joy", new BigDecimal("1000.00"));

        reajusteSalarial.reajusteSalarioFuncionario(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1000.00"), funcionario.getSalario());


    }
}
