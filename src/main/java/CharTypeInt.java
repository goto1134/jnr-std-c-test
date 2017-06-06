import jnr.ffi.types.int32_t;

/**
 * Created by Andrew
 * on 31.05.2017.
 */
public interface CharTypeInt {
    @int32_t
    int isalnum(int c);
}
