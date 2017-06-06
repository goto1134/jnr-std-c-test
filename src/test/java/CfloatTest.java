import jnr.ffi.LibraryLoader;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public class CfloatTest {

    private Cfloat cfloat;

    @Before
    public void setUp()
            throws Exception {
        cfloat = LibraryLoader.create(Cfloat.class)
                              .load("msvcrt");
    }

    @Test
    public void FLT_RADIX()
            throws Exception {
        System.out.println(cfloat.FLT_RADIX()
                                 .get());
    }

}