package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbc {
    public final Context a;
    public final boolean b;
    public final yva c;
    public final int d;
    public final ysx e;
    public final yva f;
    public final yva g;
    public final ovq h;
    public final yvc i;
    public final yvc j;
    public final mdw k;
    private final yjv l;
    private final wlf m;
    private final yow n;
    private final ysx o;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, ysx] */
    public kbc(mdw mdwVar, ovq ovqVar, kuw kuwVar, Context context, yjv yjvVar, wlf wlfVar, boolean z, yva yvaVar, yow yowVar) {
        Integer numA;
        this.k = mdwVar;
        this.h = ovqVar;
        this.a = context;
        this.l = yjvVar;
        this.m = wlfVar;
        this.b = z;
        this.c = yvaVar;
        this.n = yowVar;
        int iIntValue = 248328;
        if (wlfVar != null) {
            wmc wmcVar = wlfVar.i;
            wmcVar = wmcVar == null ? wmc.a : wmcVar;
            if (wmcVar != null && (numA = jab.a(wmcVar)) != null) {
                iIntValue = numA.intValue();
            }
        }
        this.d = iIntValue;
        ysx ysxVarA = ytb.a(new isv(mdwVar.l(), 2));
        this.o = ysxVarA;
        this.e = ytb.a(new jzb(ysxVarA, (ysx) mdwVar.i, new kba(this, null), 2));
        this.i = yvd.a(yhb.a);
        yvc yvcVarA = yvd.a(-1);
        this.j = yvcVarA;
        this.f = new yul(yvcVarA);
        this.g = vyf.w(kuwVar.a, yowVar, yut.a(5000L, 2), false);
    }

    public final void a(yjv yjvVar) {
        yjvVar.getClass();
        ykr.q(this.n, null, 0, new iyc(this, yjvVar, (yih) null, 3), 3);
    }

    public final cb b() {
        return (cb) this.l.a(true);
    }
}
