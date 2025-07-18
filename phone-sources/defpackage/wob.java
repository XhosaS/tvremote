package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wob extends vuc implements vvk {
    public static final wob a;
    private static volatile vvq d;
    public wkg b;
    public wlp c;
    private int e;
    private byte f = 2;

    static {
        wob wobVar = new wob();
        a = wobVar;
        vuc.y(wob.class, wobVar);
    }

    private wob() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new wob();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wob.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
