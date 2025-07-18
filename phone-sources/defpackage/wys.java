package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wys extends vuc implements vvk {
    public static final wys a;
    private static volatile vvq d;
    private byte e = 2;
    public vun b = vvt.a;
    public String c = "";

    static {
        wys wysVar = new wys();
        a = wysVar;
        vuc.y(wys.class, wysVar);
    }

    private wys() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002Ȉ", new Object[]{"b", wmn.class, "c"});
        }
        if (i2 == 3) {
            return new wys();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wys.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
