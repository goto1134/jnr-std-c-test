import jnr.ffi.LibraryLoader;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public class CfenvTest {

    private Cfenv cfenv;

    @Before
    public void setUp()
            throws Exception {
        cfenv = LibraryLoader.create(Cfenv.class)
                             .load("msvcrt");
    }

    @Test
    public void fegetround()
            throws Exception {
        System.out.println(cfenv.fegetround());
    }

    @Test
    public void fesetround()
            throws Exception {
        System.out.println(cfenv.fesetround(Cfenv.RoundingDirection.FE_DIVBYZERO));
    }

}