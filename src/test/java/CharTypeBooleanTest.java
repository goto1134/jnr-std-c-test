import jnr.ffi.LibraryLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 07.06.2017.
 */
public class CharTypeBooleanTest {
    private CharTypeBoolean cctype;

    @Before
    public void setUp()
            throws Exception {
        cctype = LibraryLoader.create(CharTypeBoolean.class)
                              .load("msvcrt");

    }

    @Test
    public void isalnumLower()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('a'), true);
    }

    @Test
    public void isalnumNumber()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('0'), true);
    }

    @Test
    public void isalnumCapital()
            throws Exception {
        Assert.assertEquals(cctype.isalnum('A'), true);
    }




}