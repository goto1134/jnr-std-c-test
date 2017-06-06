import jnr.ffi.LibraryLoader;
import jnr.ffi.Pointer;

/**
 * Created by Andrew
 * on 30.05.2017.
 */
class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        Cstdlib msvcrt = LibraryLoader.create(Cstdlib.class)
                                      .load("msvcrt");
        msvcrt.srand(12);
        System.out.println(msvcrt.rand());
        System.out.println(msvcrt.atof("0.1"));

        Pointer allocated = msvcrt.malloc(10);
        System.out.println(allocated.size());
        msvcrt.free(allocated);

        Cstdio stdio = LibraryLoader.create(Cstdio.class)
                                    .load("msvcrt");
        stdio.printf("Hi");
//        IntByReference intByReference = new IntByReference();
//        int a = 0;
//        stdio.scanf("%i", intByReference);
//        System.out.println(intByReference.getValue());



        //        System.out.println(stdio.stdout()
//                                .get());
    }
}
