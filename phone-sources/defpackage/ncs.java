package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncs extends nde {
    public ncs() {
        super("MOLECULE_DRIFTING");
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
            ndf.g(next, iC, ndf.a(j2, iC));
        }
        return true;
    }
}
