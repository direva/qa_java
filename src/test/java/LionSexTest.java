import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class LionSexTest {
    Feline feline = new Feline();
    private String sex;
    private boolean result;

    public LionSexTest(String sex, boolean result) {
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
}
