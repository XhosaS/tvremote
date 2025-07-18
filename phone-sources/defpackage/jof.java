package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jof extends sbx {
    public final jaf a;
    private final dhq b;

    public jof(dhq dhqVar, jaf jafVar) {
        jafVar.getClass();
        this.b = dhqVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        joi joiVar = new joi(this.b.a);
        joiVar.a = new jmm(this, ixiVar, 8);
        joiVar.b = new jnq(this, ixiVar, 4);
        return joiVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        joi joiVar = (joi) obj2;
        joiVar.F(ixiVar.a, new String[0]);
        wse wseVar = (wse) ixiVar.b;
        wls wlsVar = wseVar.d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(joiVar.c, wlsVar)) {
            joiVar.c = wlsVar;
            joiVar.G(0);
        }
        sco scoVar = new sco(wseVar.e);
        if (!yks.e(joiVar.d, scoVar)) {
            joiVar.d = scoVar;
            joiVar.G(1);
        }
        wlx wlxVar = wseVar.c;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(joiVar.e, wlxVar)) {
            joiVar.e = wlxVar;
            joiVar.G(2);
        }
        boolean z = 1 == (wseVar.b & 1);
        if (yks.e(Boolean.valueOf(joiVar.f), Boolean.valueOf(z))) {
            return;
        }
        joiVar.f = z;
        joiVar.G(4);
    }
}
