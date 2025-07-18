package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qj {
    public long a = 9205357640488583168L;
    public final re b;
    public final bcb c;
    public boolean d;
    public long e;
    public long f;
    public final bxv g;
    private final clx h;
    private final bts i;

    public qj(Context context, clx clxVar, long j, yy yyVar) {
        this.h = clxVar;
        re reVar = new re(context, bny.h(j));
        this.b = reVar;
        this.c = new bci(ygi.a, bcz.b);
        this.e = 0L;
        this.f = -1L;
        qi qiVar = new qi(this, 0);
        bsr bsrVar = btm.a;
        bts btsVar = new bts(null, null, qiVar);
        this.i = btsVar;
        this.g = Build.VERSION.SDK_INT >= 31 ? new sl(btsVar, this, reVar) : new ri(btsVar, this, reVar, yyVar);
    }

    public final float a(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectA = this.b.a();
        return hu.o(edgeEffectA) == 0.0f ? (-hu.q(edgeEffectA, -fIntBitsToFloat2, f)) * Float.intBitsToFloat((int) (4294967295L & this.e)) : Float.intBitsToFloat(i);
    }

    public final float b(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e >> 32));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectC = this.b.c();
        return hu.o(edgeEffectC) == 0.0f ? hu.q(edgeEffectC, fIntBitsToFloat2, f) * Float.intBitsToFloat((int) (this.e >> 32)) : Float.intBitsToFloat(i);
    }

    public final float c(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e >> 32));
        EdgeEffect edgeEffectE = this.b.e();
        return hu.o(edgeEffectE) == 0.0f ? (-hu.q(edgeEffectE, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.e >> 32)) : Float.intBitsToFloat(i);
    }

    public final float d(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        EdgeEffect edgeEffectG = this.b.g();
        return hu.o(edgeEffectG) == 0.0f ? hu.q(edgeEffectG, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.e)) : Float.intBitsToFloat(i);
    }

    public final long e() {
        long jP = this.a;
        if ((9223372034707292159L & jP) == 9205357640488583168L) {
            jP = d.p(this.e);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32)) / Float.intBitsToFloat((int) (this.e >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L)) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r13.a(r14, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r14 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r11, defpackage.yjz r13, defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.f(long, yjz, yih):java.lang.Object");
    }

    public final void g() {
        boolean z;
        re reVar = this.b;
        EdgeEffect edgeEffect = reVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = reVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = reVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = reVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            h();
        }
    }

    public final void h() {
        this.c.b(ygi.a);
    }

    public final void i(long j) {
        long j2 = this.e;
        boolean zS = a.s(j2, 0L);
        boolean zS2 = a.s(j, j2);
        this.e = j;
        if (!zS2) {
            re reVar = this.b;
            long jV = (yln.v(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (yln.v(Float.intBitsToFloat((int) (j >> 32))) << 32);
            reVar.a = jV;
            EdgeEffect edgeEffect = reVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect2 = reVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect3 = reVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect4 = reVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect5 = reVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect6 = reVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect7 = reVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect8 = reVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
        }
        if (zS || zS2) {
            return;
        }
        g();
    }
}
