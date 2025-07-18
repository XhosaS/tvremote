package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqx extends vuc implements vvk {
    public static final wqx a;
    public static final vvd l;
    private static volatile vvq m;
    public int b;
    public wlx d;
    public wls e;
    public wkg f;
    public wls g;
    public wls h;
    public wkg i;
    public wkg j;
    public wkx k;
    private Object n;
    private wmb o;
    public int c = 0;
    private byte p = 2;

    static {
        wqx wqxVar = new wqx();
        a = wqxVar;
        vuc.y(wqx.class, wqxVar);
        l = vuc.C(wkx.a, wqxVar, wqxVar, 389682712, vwo.MESSAGE);
    }

    private wqx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0005\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\t<\u0000\n<\u0000\u000b<\u0000\fᐉ\u0002\rᐉ\t\u000e<\u0000", new Object[]{"n", "c", "b", "d", "e", "g", "h", "i", "j", "k", wqu.class, wqv.class, wqt.class, "f", "o", wqw.class});
        }
        if (i2 == 3) {
            return new wqx();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqx.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
