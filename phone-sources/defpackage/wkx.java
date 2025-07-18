package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkx extends vtz implements vua {
    public static final wkx a;
    private static volatile vvq f;
    public int b;
    public int d;
    public wmc e;
    private byte g = 2;
    public String c = "";

    static {
        wkx wkxVar = new wkx();
        a = wkxVar;
        vuc.y(wkx.class, wkxVar);
    }

    private wkx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            wkw wkwVar = wkw.TYPE_UNSPECIFIED;
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0001\u0002ဈ\u0000\u0003ဉ\u0002", new Object[]{"b", "d", wjk.f, "c", "e"});
        }
        if (i2 == 3) {
            return new wkx();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wkx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
