import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, "Самка");
        assertThat(lion.getKittens(), is(1));
    }

    @Test
    public void validateLionFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Lion lion = new Lion(feline, "Самка");
        assertThat(lion.getFood(), is(expectedFood));
    }
}
