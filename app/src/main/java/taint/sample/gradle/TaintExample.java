package gradle;

import org.checkerframework.checker.tainting.qual.Tainted;
import java.io.IOException;

public class TaintExample {

    void makeExternalCall(@Tainted String s) {
        TaintStubSample.printUntaintedString(s);
    }

    void testRCE(@Tainted String s) throws IOException {
        Runtime.getRuntime().exec(s);
    }

}
