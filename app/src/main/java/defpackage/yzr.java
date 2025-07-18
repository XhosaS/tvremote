package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yzr extends yzb {
    public final void b(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(zag.h(iterable)));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            yxx yxxVarI = (yxx) a().get(obj);
            if (yxxVarI == null) {
                yxxVarI = yzq.i(iterable instanceof Set ? Math.max(4, ((Set) iterable).size()) : 4);
                a().put(obj, yxxVarI);
            }
            while (it.hasNext()) {
                Object next = it.next();
                ywl.a(obj, next);
                yxxVarI.c(next);
            }
        }
    }
}
