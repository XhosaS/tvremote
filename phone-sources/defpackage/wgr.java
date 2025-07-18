package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgr extends vuc implements vvk {
    public static final wgr a;
    private static volatile vvq d;
    public int b;
    public udj c;
    private byte e = 2;

    static {
        wgr wgrVar = new wgr();
        a = wgrVar;
        vuc.y(wgr.class, wgrVar);
    }

    private wgr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wgr();
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
        synchronized (wgr.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
