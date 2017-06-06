import jnr.ffi.LibraryLoader;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public class CTimeTest {

    private CTime time;

    @Before
    public void setUp()
            throws Exception {
        this.time = LibraryLoader.create(CTime.class)
                                 .load("msvcrt");
    }

    @Test
    public void clock()
            throws Exception {
        System.out.println(time.clock());
    }

}