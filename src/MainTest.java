import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void deveriaSomarDoisNumeros(){

        Main calc = new Main();
        int soma = calc.soma(3, 7);

        Assertions.assertEquals(10, soma);
    }

}
