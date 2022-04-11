import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpinWordsTest {
    @Test
    void spin_word() {
        Assertions.assertEquals("emocleW",new SpinWords().spinWords("Welcome"));
    }

    @Test
    void spin_five_or_more_word() {
        Assertions.assertEquals("Hey wollef sroirraw",new SpinWords().spinWords("Hey fellow warriors"));

    }

}
