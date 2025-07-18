package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncb extends nde {
    public ncb() {
        super("DIDN'T GET IT");
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.j(ndmVar);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().i(0.0f);
        }
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        float fB;
        int i = ndf.a;
        Iterator<ndl> it = ndmVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            fB = ndf.b(j3, j4, 550L);
            if (!it.hasNext()) {
                break;
            }
            ndl next = it.next();
            next.i((float) (Math.sin((fB - (ndmVar.c(next) * 0.030909091f)) * 6.2831855f * 3.0f) * 6.0d));
            ndf.e(ndmVar, next, j4);
            j = j3;
            j2 = j4;
        }
        return fB < 1.0f;
    }
}
