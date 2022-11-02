import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void validateEatMeat() throws Exception {
        assertThat(feline.eatMeat(), is(List.of("Животные", "Птицы", "Рыба")));
    }

    @Test
    public void validateFamily() {
        assertThat(feline.getFamily(), is("Кошачьи"));
    }

    @Test
    public void validateEmptyKittensGetting() {
        assertThat(feline.getKittens(), is(1));
    }

    @Test
    public void validateNonEmptyKittensGetting() {
        assertThat(feline.getKittens(5), is(5));
    }
}
