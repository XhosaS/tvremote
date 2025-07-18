package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nce extends nde {
    private boolean E;

    public nce() {
        super("ROTATION EXIT");
    }

    public static final float d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.nde
    public final void a(ndm ndmVar) {
        this.E = false;
        if (ndf.m(ndmVar)) {
            return;
        }
        ndmVar.j(12.0f);
    }

    @Override // defpackage.nde
    public final void b(ndm ndmVar) {
        if (this.E) {
            return;
        }
        ndmVar.k();
        ndmVar.g();
        ndf.j(ndmVar);
    }

    @Override // defpackage.nde
    public final boolean c(long j, long j2, ndm ndmVar) {
        if (ndf.m(ndmVar)) {
            return false;
        }
        if (this.E) {
            ndf.f(ndmVar, j2);
            return !ndf.m(ndmVar);
        }
        float fB = ndmVar.b();
        float fA = ndmVar.b.a() + fB;
        float fA2 = ndmVar.c.a() + fB;
        float fA3 = ndmVar.d.a() + fB;
        float fA4 = ndmVar.e.a() + fB;
        float fD = d(2.7488937f - fA);
        if (fD > d((-0.3926991f) - fA4)) {
            float f = 2.7488937f - fA2;
            float fD2 = d((-0.3926991f) - fA3);
            if (fD2 > d(f) && fD < 4.712389f && fD2 < 4.712389f) {
                ndmVar.k();
                ndmVar.g();
                ndf.j(ndmVar);
                this.E = true;
            }
        }
        return true;
    }
}
