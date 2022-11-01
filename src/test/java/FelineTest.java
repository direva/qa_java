import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void validateEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = feline.eatMeat();
        assertThat(actualFood, is(expectedFood));
    }

    @Test
    public void validateFamily() {
        Feline feline = new Feline();
        assertThat(feline.getFamily(), is("Кошачьи"));
    }

    @Test
    public void validateEmptyKittensGetting() {
        Feline feline = new Feline();
        assertThat(feline.getKittens(), is(1));
    }

    @Test
    public void validateNonEmptyKittensGetting() {
        Feline feline = new Feline();
        assertThat(feline.getKittens(5), is(5));
    }
}
