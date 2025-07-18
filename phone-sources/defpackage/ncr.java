package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncr extends nde {
    public ncr() {
        super("MOLECULE_WAVY");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.l(ndmVar);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        jys.V(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            int iC = ndmVar.c(next);
            float fA = ndf.a(j2, iC);
            ndf.g(next, iC, fA);
            if (next == ndmVar.b) {
                if (fA % 0.5d < 0.25d) {
                    next.m(14.0f);
                } else {
                    next.m(12.0f);
                }
            }
        }
        return true;
    }
}
