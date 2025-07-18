package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncg extends nde {
    public ncg() {
        super("GOOGLE LOGO ENTER");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.j(ndmVar);
        ndmVar.i(true);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.p(1);
            next.n(1.0f);
            next.i(ndmVar.a(next));
            next.j(0.0f);
        }
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
            if (fB - (ndmVar.c(next) * 0.15f) > 0.0f) {
                next.p(1);
                next.n(1.0f);
                next.i(ndmVar.a(next));
                next.j(0.0f);
            } else {
                ndf.e(ndmVar, next, j2);
            }
        }
        return fB < 1.0f;
    }
}
