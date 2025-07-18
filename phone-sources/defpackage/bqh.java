package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bqh {
    private bnr a;
    private float b = 1.0f;
    private cmi c = cmi.a;

    public abstract long a();

    protected abstract void b(bpq bpqVar);

    protected void c(float f) {
        throw null;
    }

    protected void d(bnr bnrVar) {
        throw null;
    }

    public final void e(bpq bpqVar, long j, float f, bnr bnrVar) {
        if (this.b != f) {
            c(f);
            this.b = f;
        }
        if (!yks.e(this.a, bnrVar)) {
            d(bnrVar);
            this.a = bnrVar;
        }
        cmi cmiVarO = bpqVar.o();
        if (this.c != cmiVarO) {
            f(cmiVarO);
            this.c = cmiVarO;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bpqVar.n() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bpqVar.n() & 4294967295L)) - Float.intBitsToFloat(i2);
        bpqVar.p().c.A(fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    b(bpqVar);
                }
            } finally {
                bpqVar.p().c.A(f2, f3);
            }
        }
    }

    protected void f(cmi cmiVar) {
    }
}
