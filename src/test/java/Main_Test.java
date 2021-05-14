import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main_Test {
    @Test
    public void test_Given_ApplicationStarted_When_CallingMain_Then_CorrectOutputExpected() {
        //arrange

        //act
        int actual = Main.add(Main.x, Main.y);

        //assert
        Assertions.assertEquals(11, actual);
    }
}
