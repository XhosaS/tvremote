package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyb extends vuc implements vvk {
    public static final vuk a = new qiu(20);
    public static final vyb b;
    private static volatile vvq g;
    public String c = "";
    public vun d;
    public vuj e;
    public vun f;

    static {
        vyb vybVar = new vyb();
        b = vybVar;
        vuc.y(vyb.class, vybVar);
    }

    private vyb() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vud.a;
        this.f = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001Ȉ\u0002Ț\u0003,\u0004\u001b", new Object[]{"c", "d", "e", "f", vya.class});
        }
        if (i2 == 3) {
            return new vyb();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vyb.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
