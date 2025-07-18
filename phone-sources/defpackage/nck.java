package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nck extends nde {
    public nck() {
        super("MIC_EXIT");
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.o(0);
            next.i(0.0f);
            next.j(0.0f);
        }
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        ndl ndlVar = ndmVar.c;
        ndlVar.o(0);
        ndl ndlVar2 = ndmVar.d;
        ndlVar2.o(0);
        ndmVar.e.o(0);
        if (ndlVar.b() < 0.5f) {
            ndmVar.b.o(0);
            ndlVar.i(0.0f);
            ndlVar2.i(0.0f);
        }
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndf.e(ndmVar, it.next(), j2);
        }
        Iterator<ndl> it2 = ndmVar.iterator();
        while (it2.hasNext()) {
            if (it2.next().x()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
    }
}
