package taint.sample.gradle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListPage<E> extends ArrayList<E> {
    public ArrayListPage(final List<? extends E> list) {
        super(list != null ? list : Collections.emptyList());
//        super(list);
//        super(Collections.emptyList());
    }
}
