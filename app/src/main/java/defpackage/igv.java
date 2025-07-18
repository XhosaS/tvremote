package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igv {
    public final ykx a(ymc ymcVar, String str) {
        Object next;
        ylb ylbVar = ymcVar.d;
        if (ylbVar == null) {
            ylbVar = ylb.a;
        }
        abxs abxsVar = ylbVar.b;
        abxsVar.getClass();
        Iterator<E> it = abxsVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (agvy.c(((ykx) next).d, str)) {
                break;
            }
        }
        return (ykx) next;
    }
}
