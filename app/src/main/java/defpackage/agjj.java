package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjj extends agfl {
    final Iterable b;

    public agjj(Iterable iterable) {
        this.b = iterable;
    }

    @Override // defpackage.agfl
    public final void e(aide aideVar) {
        try {
            Iterator it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    aideVar.a(agnr.a);
                    aideVar.d();
                } else if (aideVar instanceof agho) {
                    aideVar.a(new agjh((agho) aideVar, it));
                } else {
                    aideVar.a(new agji(aideVar, it));
                }
            } catch (Throwable th) {
                aggq.a(th);
                agnr.d(th, aideVar);
            }
        } catch (Throwable th2) {
            aggq.a(th2);
            agnr.d(th2, aideVar);
        }
    }
}
