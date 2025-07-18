package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ndc extends nde {
    public ndc() {
        super("GOT IT");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.j(ndmVar);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        jys.W(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        float fB;
        int i = ndf.a;
        Iterator<ndl> it = ndmVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            fB = ndf.b(j3, j4, 1000L);
            if (!it.hasNext()) {
                break;
            }
            ndl next = it.next();
            float fC = fB - (ndmVar.c(next) * 0.05f);
            if (fC < 0.0f) {
                ndf.e(ndmVar, next, j4);
            } else if (fC < 0.15f) {
                next.j(-8.0f);
            } else if (fC < 0.3f) {
                next.j(8.0f);
            } else {
                ndf.e(ndmVar, next, j4);
            }
            j = j3;
            j2 = j4;
        }
        return fB < 1.0f;
    }
}
