package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jph extends sbx {
    public final jaf a;
    private final dxc b;

    public jph(dxc dxcVar, jaf jafVar) {
        jafVar.getClass();
        this.b = dxcVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jpk jpkVar = new jpk(this.b.a, 0);
        jpkVar.a = new jmm(this, ixiVar, 12);
        jpkVar.b = new jnq(this, ixiVar, 8);
        return jpkVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jpk jpkVar = (jpk) obj2;
        jpkVar.F(ixiVar.a, new String[0]);
        wss wssVar = (wss) ixiVar.b;
        wls wlsVar = wssVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jpkVar.c, wlsVar)) {
            jpkVar.c = wlsVar;
            jpkVar.G(0);
        }
        wls wlsVar2 = wssVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (yks.e(jpkVar.d, wlsVar2)) {
            return;
        }
        jpkVar.d = wlsVar2;
        jpkVar.G(1);
    }
}
