package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkg extends vtz implements vua {
    public static final wkg a;
    private static volatile vvq d;
    public int b;
    public int c;
    private byte e = 2;

    static {
        wkg wkgVar = new wkg();
        a = wkgVar;
        vuc.y(wkg.class, wkgVar);
    }

    private wkg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            wkf wkfVar = wkf.TYPE_UNSPECIFIED;
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", wjk.e});
        }
        if (i2 == 3) {
            return new wkg();
        }
        if (i2 == 4) {
            return new vty(a);
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
        synchronized (wkg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
