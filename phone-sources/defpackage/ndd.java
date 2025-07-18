package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ndd extends nde {
    public ndd() {
        super("LISTENING_GOT_IT_LOOPED");
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
        int i = ndf.a;
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            long j3 = j;
            long j4 = j2;
            float fB = ndf.b(j3, j4, 1000L);
            ndl next = it.next();
            float fC = fB - (ndmVar.c(next) * 0.05f);
            if (fC < 0.0f) {
                ndf.e(ndmVar, next, j4);
            } else {
                float f = fC % 1.3f;
                if (f < 0.15f) {
                    next.j(-8.0f);
                } else if (f < 0.3f) {
                    next.j(8.0f);
                } else {
                    ndf.e(ndmVar, next, j4);
                }
            }
            j = j3;
            j2 = j4;
        }
        return true;
    }
}
