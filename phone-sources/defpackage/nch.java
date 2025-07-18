package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nch extends nde {
    public nch() {
        super("GOOGLE LOGO");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndmVar.i(true);
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
        return false;
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
    }
}
