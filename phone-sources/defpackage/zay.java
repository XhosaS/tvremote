package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zay extends vuc implements vvk {
    public static final zay a;
    private static volatile vvq b;
    private int c;
    private zan d;
    private byte e = 2;

    static {
        zay zayVar = new zay();
        a = zayVar;
        vuc.y(zay.class, zayVar);
    }

    private zay() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new zay();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zay.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
