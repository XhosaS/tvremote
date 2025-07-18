package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkn extends agfo {
    final Iterable a;

    public agkn(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    aghe.c(agfsVar);
                    return;
                }
                agkm agkmVar = new agkm(agfsVar, it);
                agfsVar.d(agkmVar);
                if (agkmVar.d) {
                    return;
                }
                while (!agkmVar.c) {
                    try {
                        Iterator it2 = agkmVar.b;
                        Object next = it2.next();
                        aghn.b(next, "The iterator returned a null value");
                        agkmVar.a.c(next);
                        if (agkmVar.c) {
                            return;
                        }
                        try {
                            if (!it2.hasNext()) {
                                if (agkmVar.c) {
                                    return;
                                }
                                agkmVar.a.a();
                                return;
                            }
                        } catch (Throwable th) {
                            aggq.a(th);
                            agkmVar.a.fe(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        aggq.a(th2);
                        agkmVar.a.fe(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                aggq.a(th3);
                aghe.e(th3, agfsVar);
            }
        } catch (Throwable th4) {
            aggq.a(th4);
            aghe.e(th4, agfsVar);
        }
    }
}
