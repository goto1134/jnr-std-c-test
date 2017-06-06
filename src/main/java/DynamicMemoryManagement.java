import jnr.ffi.Pointer;
import jnr.ffi.types.size_t;

/**
 * Created by Andrew
 * on 30.05.2017.
 */
public interface DynamicMemoryManagement {
    Pointer malloc(@size_t long size);

    void free(Pointer ptr);

    Pointer calloc(@size_t long num, @size_t long size);

    Pointer realloc(Pointer ptr, @size_t long size);
}
