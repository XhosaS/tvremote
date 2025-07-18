package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvk implements dse {
    public final dve a;
    public final dru b;
    public final dvs c;
    public final eoe e;
    public dvk f;
    public boolean g;
    public final Object l;
    public dsz m;
    public final List d = new ArrayList();
    public int h = -1;
    public int i = -1;
    public float j = -1.0f;
    public float k = -1.0f;

    public dvk(dve dveVar, dru druVar, dvs dvsVar, eoe eoeVar, dvk dvkVar) {
        this.a = dveVar;
        this.b = druVar;
        this.c = dvsVar;
        this.e = eoeVar;
        this.f = dvkVar;
        drq drqVarD = dvsVar.d();
        Map map = drq.g;
        this.l = drqVarD.r();
    }

    public static boolean n(dvk dvkVar) {
        dvs dvsVar = dvkVar.c;
        drq drqVarD = dvkVar.j().d();
        return drqVarD != null && drqVarD.ah() == 3;
    }

    @Override // defpackage.dse
    public final int a() {
        return (int) this.e.a();
    }

    @Override // defpackage.dse
    public final int b() {
        return duc.a(this.e.i(4));
    }

    @Override // defpackage.dse
    public final int c() {
        return duc.a(this.e.i(1));
    }

    @Override // defpackage.dse
    public final int d() {
        return duc.a(this.e.i(3));
    }

    @Override // defpackage.dse
    public final int e() {
        return duc.a(this.e.i(2));
    }

    @Override // defpackage.dse
    public final int f() {
        return (int) this.e.b();
    }

    @Override // defpackage.dse
    public final eny g() {
        return this.e.e();
    }

    public final int h() {
        return this.d.size();
    }

    public final dvk i(int i) {
        return (dvk) this.d.get(i);
    }

    public dvs j() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [duv, java.lang.Object] */
    public void k(int i, int i2, dxt dxtVar) {
        boolean z = ebc.a;
        dvs dvsVar = this.c;
        drq drqVarD = dvsVar.d();
        dru druVarE = dvsVar.e();
        dsz dszVar = this.g ? this.m : null;
        if (dszVar == null || dszVar.g != i || dszVar.h != i2) {
            drqVarD.K(druVarE, this, i, i2, dxtVar, this.l);
            return;
        }
        drqVarD.au();
        dxtVar.a = (int) dszVar.e;
        dxtVar.b = (int) dszVar.f;
    }

    public final boolean l() {
        dww dwwVar;
        dvs dvsVar = this.c;
        return (dvsVar.p == null || (dwwVar = dvsVar.f) == null || !dwwVar.G()) ? false : true;
    }

    public final boolean m() {
        for (int i = 0; i < 4; i++) {
            if (this.c.d[i] != 0) {
                eoe eoeVar = this.e;
                return (eoeVar.h(1) == 0.0f && eoeVar.h(2) == 0.0f && eoeVar.h(3) == 0.0f && eoeVar.h(4) == 0.0f) ? false : true;
            }
        }
        return false;
    }

    public final float o(dtm dtmVar, int i) {
        int i2 = i - 1;
        eny enyVarE = this.e.e();
        eny enyVar = eny.RTL;
        int i3 = 6;
        int i4 = 5;
        if (i2 == 0) {
            i4 = 6;
            i3 = 5;
        } else if (i2 != 2) {
            throw new IllegalArgumentException("Not an horizontal padding edge: ".concat(enz.a(i)));
        }
        if (enyVarE == enyVar) {
            i3 = i4;
        }
        byte b = dtmVar.b(i3 - 1);
        float f = b == 15 ? Float.NaN : dtmVar.b[b];
        return enx.a(f) ? dtmVar.d(i) : f;
    }

    public final int p(int i) {
        return duc.a(this.e.h(i));
    }
}
