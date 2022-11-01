import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void validateCatSound() {
        assertThat(cat.getSound(), is("Мяу"));
    }

    @Test
    public void validateCatFood() throws Exception {
        assertThat(cat.getFood(), is(List.of("Животные", "Птицы", "Рыба")));
    }
}
