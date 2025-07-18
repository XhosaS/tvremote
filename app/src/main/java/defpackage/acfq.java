package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfq extends abww implements abyr {
    public acfq() {
        super(acfr.b);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acfr acfrVar = (acfr) this.b;
        abxk abxkVar = acfr.a;
        abxj abxjVar = acfrVar.e;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            acfrVar.e = abxjVar.d(size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            acfrVar.e.h(((acgd) it.next()).dE);
        }
    }
}
