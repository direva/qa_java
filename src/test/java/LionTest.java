import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class LionTest {
    Feline feline = new Feline();
    private String sex;
    private boolean result;

    public LionTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false },
        };
    }

    @Test
    public void validateLionSex() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertThat(lion.doesHaveMane(), is(result));
    }

    @Test
    public void validateKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        assertThat(lion.getKittens(), is(1));
    }

    @Test
    public void validateLionFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        assertThat(lion.getFood(), is(List.of("Животные", "Птицы", "Рыба")));
    }
}
