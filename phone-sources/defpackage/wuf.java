package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuf extends vuc implements vvk {
    public static final wuf a;
    private static volatile vvq h;
    public int b;
    public wls c;
    public wls d;
    public wls e;
    public wkg f;
    public wlx g;
    private byte i = 2;

    static {
        wuf wufVar = new wuf();
        a = wufVar;
        vuc.y(wuf.class, wufVar);
    }

    private wuf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new wuf();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wuf.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
