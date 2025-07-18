package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ncv extends nde {
    private final int[] E;

    public ncv() {
        super("MOLECULE_APPEAR");
        this.E = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        ndf.l(ndmVar);
        ndmVar.d(0.0f);
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.j(nde.a[ndmVar.c(next)] + 10.0f);
        }
        ndmVar.h();
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        jys.V(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        float fB;
        int i = ndf.a;
        Iterator<ndl> it = ndmVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            fB = ndf.b(j3, j4, 300L);
            if (!it.hasNext()) {
                break;
            }
            ndl next = it.next();
            int iC = ndmVar.c(next);
            float f = fB - (this.E[iC] * 0.01f);
            if (f > 0.0f && f < 0.5f) {
                next.j(nde.a[iC] - 32.0f);
            } else if (f > 0.5f && f < 1.0f) {
                next.j(nde.a[iC]);
            }
            j = j3;
            j2 = j4;
        }
        ndmVar.d(fB);
        return fB < 1.0f;
    }
}
