import jnr.ffi.LibraryLoader;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public class CstdioTest {

    private Cstdio stdio;

    @Before
    public void setUp()
            throws Exception {
        stdio = LibraryLoader.create(Cstdio.class)
                             .load("msvcrt");
    }

    @Test
    public void stdout()
            throws Exception {
        System.out.println(stdio.stdout()
                                .get());
    }

}