import jnr.ffi.types.clock_t;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public interface CTime {
    @clock_t
    long clock();

}
