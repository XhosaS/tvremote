package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tss {
    public static final /* synthetic */ tsr a(tsq tsqVar) {
        abxd abxdVarV = tsqVar.v();
        abxdVarV.getClass();
        return (tsr) abxdVarV;
    }

    public static final /* synthetic */ void b(Iterable iterable, tsq tsqVar) {
        if ((tsqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            tsqVar.y();
        }
        tsr tsrVar = (tsr) tsqVar.b;
        abxk abxkVar = tsr.a;
        abxj abxjVar = tsrVar.c;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            tsrVar.c = abxjVar.d(size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            tsrVar.c.h(((tsw) it.next()).a());
        }
    }

    public static final /* synthetic */ void c(tsq tsqVar) {
        new abxl(((tsr) tsqVar.b).c, tsr.a);
    }
}
