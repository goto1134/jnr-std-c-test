import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.annotations.StdCall;

/**
 * Created by Andrew
 * on 30.05.2017.
 */
public interface IntegerArithmetics {
    int abs(int n);

    /**
     * C++ 98
     */
    long abs(long n);

    @StdCall
    Pointer div(int num, int denom);

    class div_t
            extends Struct {
        public final Signed16 quot = new Signed16();
        public final Signed16 rem = new Signed16();

        public div_t(Runtime runtime) {
            super(runtime);
        }

        public div_t(Runtime runtime, Alignment alignment) {
            super(runtime, alignment);
        }

        public div_t(Runtime runtime, Struct enclosing) {
            super(runtime, enclosing);
        }
    }
}
