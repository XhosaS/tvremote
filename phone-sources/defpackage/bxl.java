package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxl {
    public final bxm a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private bxm i;
    public boolean b = true;
    public final Map h = new HashMap();

    public bxl(bxm bxmVar) {
        this.a = bxmVar;
    }

    public abstract int a(bzq bzqVar, bub bubVar);

    protected abstract long b(bzq bzqVar, long j);

    public abstract Map c(bzq bzqVar);

    public final void d(bub bubVar, int i, bzq bzqVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(bzqVar, jB);
                bzqVar = bzqVar.w;
                bzqVar.getClass();
                if (yks.e(bzqVar, this.a.j())) {
                    break loop0;
                }
            } while (!c(bzqVar).containsKey(bubVar));
            float fA = a(bzqVar, bubVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        float fIntBitsToFloat = bubVar instanceof bus ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32));
        Map map = this.h;
        int iRound = Math.round(fIntBitsToFloat);
        if (map.containsKey(bubVar)) {
            iRound = ((Number) bubVar.a.a(Integer.valueOf(((Number) yfm.g(map, bubVar)).intValue()), Integer.valueOf(iRound))).intValue();
        }
        map.put(bubVar, Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        bxm bxmVar = this.a;
        bxm bxmVarI = bxmVar.i();
        if (bxmVarI == null) {
            return;
        }
        if (this.c) {
            bxmVarI.n();
        } else if (this.e || this.d) {
            bxmVarI.m();
        }
        if (this.f) {
            bxmVar.n();
        }
        if (this.g) {
            bxmVar.m();
        }
        bxmVarI.h().e();
    }

    public final void f() {
        Map map = this.h;
        map.clear();
        brj brjVar = new brj(this, 11);
        bxm bxmVar = this.a;
        bxmVar.k(brjVar);
        map.putAll(c(bxmVar.j()));
        this.b = false;
    }

    public final void g() {
        bxm bxmVar;
        bxl bxlVarH;
        bxl bxlVarH2;
        if (i()) {
            bxmVar = this.a;
        } else {
            bxm bxmVarI = this.a.i();
            if (bxmVarI == null) {
                return;
            }
            bxmVar = bxmVarI.h().i;
            if (bxmVar == null || !bxmVar.h().i()) {
                bxm bxmVar2 = this.i;
                if (bxmVar2 == null || bxmVar2.h().i()) {
                    return;
                }
                bxm bxmVarI2 = bxmVar2.i();
                if (bxmVarI2 != null && (bxlVarH2 = bxmVarI2.h()) != null) {
                    bxlVarH2.g();
                }
                bxm bxmVarI3 = bxmVar2.i();
                bxmVar = (bxmVarI3 == null || (bxlVarH = bxmVarI3.h()) == null) ? null : bxlVarH.i;
            }
        }
        this.i = bxmVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
