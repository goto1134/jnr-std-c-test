import jnr.ffi.Pointer;
import jnr.ffi.Variable;
import jnr.ffi.byref.IntByReference;

/**
 * Created by Andrew
 * on 30.05.2017.
 */
public interface Cstdio {
    int printf(String format);

    int scanf(String format, IntByReference intByReference);

    Variable<Pointer> stdout();
}
