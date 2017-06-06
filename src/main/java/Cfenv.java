import jnr.ffi.util.EnumMapper;

/**
 * Created by Andrew
 * on 03.06.2017.
 */
public interface Cfenv {

    RoundingDirection fegetround();

    int fesetround(RoundingDirection rdir);

    enum RoundingDirection
            implements EnumMapper.IntegerEnum {
        FE_INVALID(0x01),
        FE_DENORMAL(0x02),
        FE_DIVBYZERO(0x04),
        FE_OVERFLOW(0x08),
        FE_UNDERFLOW(0x10),
        FE_INEXACT(0x20);

        final int value;

        RoundingDirection(int value) {this.value = value;}

        @Override
        public int intValue() {
            return 0;
        }
    }
}
