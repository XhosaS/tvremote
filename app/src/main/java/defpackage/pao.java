package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class pao {
    public static final pao b;

    static {
        int i = yyk.e;
        b = new pak(null, zcg.b);
    }

    public static pao c(pan panVar, List list) {
        list.getClass();
        if (!list.isEmpty()) {
            yqw.B(!list.contains(null), "null VeTreeNode child in children iterable.");
            return new pak(panVar, new ArrayList(list));
        }
        if (panVar == null) {
            return b;
        }
        int i = yyk.e;
        return new pak(panVar, zcg.b);
    }

    public abstract pan a();

    public abstract List b();
}
