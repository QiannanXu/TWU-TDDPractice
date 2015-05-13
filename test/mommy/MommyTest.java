package mommy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MommyTest {
    private Mommy mommy;

    @Before
    public void init(){
        mommy = new Mommy();
    }

    @Test
    public void shouldBeEmpty(){
        String expected = "";
        assertThat(expected, is(mommy.convertString("")));
    }

    @Test
    public void shouldReturnMommyWhenInputVowel() {
        String expected = "mommy";
        assertThat(expected, is(mommy.convertString("a")));
        assertThat(expected, is(mommy.convertString("e")));
        assertThat(expected, is(mommy.convertString("i")));
        assertThat(expected, is(mommy.convertString("o")));
        assertThat(expected, is(mommy.convertString("u")));
    }

    @Test
    public void shouldReturnTheSameWordWhenInputNotVowel() {
        assertThat("b", is(mommy.convertString("b")));
        assertThat("c", is(mommy.convertString("c")));
    }

    @Test
    public void shouldReturnMommyBWhenInputAB(){
        String expected = "mommyb";
        assertThat(expected, is(mommy.convertString("ab")));
    }

    @Test
    public void shouldReturnABCDWhenInputABCD(){
        String expected = "abcd";
        assertThat(expected, is(mommy.convertString("abcd")));
    }
}
