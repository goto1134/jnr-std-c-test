import jnr.ffi.annotations.LongLong;

/**
 * Created by Andrew
 * on 30.05.2017.
 */
public interface StringConversion {
    double atof(String doubleString);

    int atoi(String intString);

    long atol(String longString);

    @LongLong
    long atoll(String longLongString);
}
