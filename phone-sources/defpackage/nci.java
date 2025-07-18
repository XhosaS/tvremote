package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nci extends nde {
    public nci() {
        super("GOOGLE LOGO EXIT");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndmVar.i(true);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndmVar.f.n(0.0f);
        ndmVar.g.n(0.0f);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.p(0);
            next.i(0.0f);
        }
        ndmVar.i(false);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        ndl ndlVar;
        ndl ndlVar2;
        int i = ndf.a;
        Iterator<ndl> it = ndmVar.iterator();
        while (true) {
            ndlVar = ndmVar.g;
            ndlVar2 = ndmVar.f;
            if (!it.hasNext()) {
                break;
            }
            float fB = ndf.b(j, j2, 500L);
            ndl next = it.next();
            if (fB - (ndmVar.c(next) * 0.15f) > 0.0f) {
                next.p(0);
                next.i(0.0f);
                if (next == ndlVar2 || next == ndlVar) {
                    next.n(0.0f);
                }
                ndf.e(ndmVar, next, j2);
            }
        }
        return ndlVar2.y() || ndlVar.y();
    }
}
