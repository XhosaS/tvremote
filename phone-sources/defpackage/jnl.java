package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnl extends sbx {
    private final dhq a;

    public jnl(dhq dhqVar) {
        this.a = dhqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new jpk((yfo) this.a.a, 1, (byte[]) null);
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jpk jpkVar = (jpk) obj2;
        jpkVar.F(ixiVar.a, new String[0]);
        wut wutVar = (wut) ixiVar.b;
        wlx wlxVar = wutVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(jpkVar.c, wlxVar)) {
            jpkVar.c = wlxVar;
            jpkVar.G(0);
        }
        sco scoVar = new sco(wutVar.c);
        if (!yks.e(jpkVar.a, scoVar)) {
            jpkVar.a = scoVar;
            jpkVar.G(1);
        }
        wls wlsVar = wutVar.d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jpkVar.d, wlsVar)) {
            jpkVar.d = wlsVar;
            jpkVar.G(3);
        }
        wla wlaVar = wutVar.e;
        if (wlaVar == null) {
            wlaVar = wla.a;
        }
        if (yks.e(jpkVar.b, wlaVar)) {
            return;
        }
        jpkVar.b = wlaVar;
        jpkVar.G(2);
    }
}
