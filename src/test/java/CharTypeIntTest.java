import jnr.ffi.LibraryLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public class CharTypeIntTest {

    private CharTypeInt cctype;

    @Before
    public void setUp()
            throws Exception {
        cctype = LibraryLoader.create(CharTypeInt.class)
                              .load("msvcrt");

    }

    @Test
    public void isalnumLower()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('a'), 2);
    }

    @Test
    public void isalnumNumber()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('0'), 4);
    }

    @Test
    public void isalnumCapital()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('A'), 1);
    }


}