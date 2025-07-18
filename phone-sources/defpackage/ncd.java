package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncd extends nde {
    public ncd() {
        super("REPLY");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.n(ndmVar);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().t(false);
        }
        ndf.n(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (j2 - j > 300) {
            Iterator<ndl> it = ndmVar.iterator();
            while (it.hasNext()) {
                it.next().t(true);
            }
        }
        Iterator<ndl> it2 = ndmVar.iterator();
        while (it2.hasNext()) {
            ndl next = it2.next();
            next.k((next.m * 4.0f) + 4.0f);
        }
        return true;
    }
}
