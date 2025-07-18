package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blw extends bko implements byl, byc {
    public bqh a;
    public boolean b;
    public bkd c;
    public buo d;
    public float e;
    public bnr f;

    public blw(bqh bqhVar, boolean z, bkd bkdVar, buo buoVar, float f, bnr bnrVar) {
        this.a = bqhVar;
        this.b = z;
        this.c = bkdVar;
        this.d = buoVar;
        this.e = f;
        this.f = bnrVar;
    }

    private final long i(long j) {
        char c;
        boolean z = clv.h(j) && clv.g(j);
        boolean z2 = clv.j(j) && clv.i(j);
        if ((!l() && z) || z2) {
            return clv.k(j, clv.b(j), 0, clv.a(j), 0, 10);
        }
        long jA = this.a.a();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(clw.c(j, n(jA) ? Math.round(Float.intBitsToFloat((int) (jA >> 32))) : clv.d(j))) << 32) | (Float.floatToRawIntBits(clw.b(j, m(jA) ? Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))) : clv.c(j))) & 4294967295L);
        if (l()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !n(this.a.a()) ? Float.intBitsToFloat(i) : Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !m(this.a.a()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits2 << 32;
            long j3 = jFloatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) == 0.0f) {
                c = ' ';
            } else {
                c = ' ';
                if (Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) != 0.0f) {
                    long j4 = j2 | j3;
                    jFloatToRawIntBits = fh.Q(j4, this.d.a(j4, jFloatToRawIntBits));
                }
            }
            jFloatToRawIntBits = 0;
        } else {
            c = ' ';
        }
        return clv.k(j, clw.c(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)))), 0, clw.b(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    private final boolean l() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean m(long j) {
        return !a.s(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040;
    }

    private static final boolean n(long j) {
        return !a.s(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(i(j));
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new lk(bwjVarU, 14));
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        long jQ;
        long jA = this.a.a();
        float fIntBitsToFloat = n(jA) ? Float.intBitsToFloat((int) (jA >> 32)) : Float.intBitsToFloat((int) (byuVar.n() >> 32));
        float fIntBitsToFloat2 = m(jA) ? Float.intBitsToFloat((int) (jA & 4294967295L)) : Float.intBitsToFloat((int) (byuVar.n() & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        if (Float.intBitsToFloat((int) (byuVar.n() >> 32)) == 0.0f || Float.intBitsToFloat((int) (byuVar.n() & 4294967295L)) == 0.0f) {
            jQ = 0;
        } else {
            long j = jFloatToRawIntBits2 | jFloatToRawIntBits;
            jQ = fh.Q(j, this.d.a(j, byuVar.n()));
        }
        long j2 = jQ;
        long jA2 = this.c.a((Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (byuVar.n() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (byuVar.n() & 4294967295L))) & 4294967295L), byuVar.o());
        float fA = cmf.a(jA2);
        float fB = cmf.b(jA2);
        byuVar.p().c.y(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            this.a.e(byuVar, j2, this.e, this.f);
            byuVar.p().c.y(f, f2);
            byuVar.r();
        } catch (Throwable th) {
            byuVar.p().c.y(f, f2);
            throw th;
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        if (!l()) {
            return buyVar.c(i);
        }
        long jI = i(clw.k(i, 0, 13));
        return Math.max(clv.c(jI), buyVar.c(i));
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        if (!l()) {
            return buyVar.d(i);
        }
        long jI = i(clw.k(0, i, 7));
        return Math.max(clv.d(jI), buyVar.d(i));
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        if (!l()) {
            return buyVar.e(i);
        }
        long jI = i(clw.k(i, 0, 13));
        return Math.max(clv.c(jI), buyVar.e(i));
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        if (!l()) {
            return buyVar.f(i);
        }
        long jI = i(clw.k(0, i, 7));
        return Math.max(clv.d(jI), buyVar.f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
