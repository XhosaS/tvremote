package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nda extends nde {
    public nda() {
        super("USER_SPEAKS");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.j(ndmVar);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().j(0.0f);
        }
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().h(0.0f);
        }
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            float f = next.m;
            int iC = ndmVar.c(next);
            next.h(f * (iC != 0 ? iC != 1 ? iC != 2 ? iC != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
