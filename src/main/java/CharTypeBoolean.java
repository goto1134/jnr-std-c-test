import jnr.ffi.types.int32_t;

/**
 * Created by Andrew
 * on 07.06.2017.
 */
public interface CharTypeBoolean {
    @int32_t
    boolean isalnum(int c);
}
