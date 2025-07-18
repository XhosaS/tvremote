package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncj extends nde {
    public ncj() {
        super("MIC ENTER");
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndf.h(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (!ndf.m(ndmVar)) {
            ndf.f(ndmVar, j2);
            return true;
        }
        float fB = ndf.b(j, j2, 300L);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            if (fB - (ndmVar.c(next) * 0.15f) < 0.0f) {
                ndf.e(ndmVar, next, j2);
            } else {
                next.j(-6.0f);
            }
        }
        if (ndmVar.b.c() < -5.666999816894531d) {
            ndf.k(ndmVar);
        }
        Iterator<ndl> it2 = ndmVar.iterator();
        while (it2.hasNext()) {
            if (!it2.next().x()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
    }
}
