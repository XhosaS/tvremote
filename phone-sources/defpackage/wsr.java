package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsr extends vuc implements vvk {
    public static final wsr a;
    public static final vvd j;
    private static volatile vvq k;
    public int b;
    public wlx e;
    public wmb f;
    public wls g;
    public wls h;
    public wlx i;
    private Object l;
    public int c = 0;
    private byte m = 2;
    public String d = "";

    static {
        wsr wsrVar = new wsr();
        a = wsrVar;
        vuc.y(wsr.class, wsrVar);
        j = vuc.C(wkx.a, wsrVar, wsrVar, 400848401, vwo.MESSAGE);
    }

    private wsr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0001\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\b<\u0000\t<\u0000", new Object[]{"l", "c", "b", "d", "e", "f", "g", "h", "i", wsp.class, wsq.class});
        }
        if (i2 == 3) {
            return new wsr();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wsr.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
