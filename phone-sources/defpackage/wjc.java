package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjc extends vuc implements vvk {
    public static final wjc a;
    private static volatile vvq b;
    private int c;
    private wjb d;
    private byte e = 2;

    static {
        wjc wjcVar = new wjc();
        a = wjcVar;
        vuc.y(wjc.class, wjcVar);
    }

    private wjc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new wjc();
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
        synchronized (wjc.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
