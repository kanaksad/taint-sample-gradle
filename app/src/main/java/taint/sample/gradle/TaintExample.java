package gradle;

import edu.ucr.cs.riple.taint.ucrtainting.qual.RTainted;
import java.io.IOException;

public class TaintExample {

    void makeExternalCall(@RTainted String s) {
        TaintStubSample.printUntaintedString(s);
    }

    void testRCE(@RTainted String s) throws IOException {
        Runtime.getRuntime().exec(s);
    }

}
