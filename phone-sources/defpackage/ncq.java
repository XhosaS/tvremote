package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncq extends nde {
    public ncq() {
        super("MOLECULE_EXIT");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndmVar.b.w(3.1415927f, 12.0f);
        ndmVar.c.w(3.1415927f, 4.0f);
        ndmVar.d.w(0.0f, 4.0f);
        ndmVar.e.w(0.0f, 12.0f);
        ndmVar.f.w(0.0f, 8.0f);
        ndmVar.g.w(0.0f, 8.0f);
        ndf.c(ndmVar);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.m(4.0f);
            next.i(0.0f);
            next.l(1.0f);
        }
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        ndf.i(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (j2 - j >= 100) {
            ndf.f(ndmVar, j2);
            return false;
        }
        ndmVar.b.j(16.0f);
        ndmVar.c.j(9.0f);
        ndmVar.d.j(14.0f);
        ndmVar.e.j(10.0f);
        return true;
    }
}
