package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmw extends vuc implements vvk {
    public static final wmw a;
    private static volatile vvq d;
    public wni b;
    public wom c;
    private int e;
    private byte f = 2;

    static {
        wmw wmwVar = new wmw();
        a = wmwVar;
        vuc.y(wmw.class, wmwVar);
    }

    private wmw() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new wmw();
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
        synchronized (wmw.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
