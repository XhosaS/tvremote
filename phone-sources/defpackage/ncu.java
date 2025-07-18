package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncu extends nde {
    public ncu() {
        super("MOLECULE HIDDEN");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.l(ndmVar);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.j(nde.a[ndmVar.c(next)] + 10.0f);
            ndmVar.d(0.0f);
        }
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndmVar.d(0.0f);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        return false;
    }
}
