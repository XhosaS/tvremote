package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knf {
    public static final knf a = new knf();
    private static final long b;

    static {
        long j = bny.j(4294967295L);
        b = bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.1f, bnq.f(j));
    }

    private knf() {
    }

    public final void a(bkp bkpVar, bao baoVar, int i) {
        bao baoVarD = baoVar.d(1970377332);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            xo.b(hq.f(bkpVar, b, boh.a), baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(this, bkpVar, i, 5);
        }
    }
}
