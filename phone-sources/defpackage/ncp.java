package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncp extends nde {
    public ncp() {
        super("MOLECULE_INACTIVE");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.c(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        ndmVar.e(0.0f);
        if (ndf.m(ndmVar) && j2 - j < 100) {
            ndf.d(ndmVar);
            return true;
        }
        ndf.l(ndmVar);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            if (it.next().j.c > 0.001f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
    }
}
