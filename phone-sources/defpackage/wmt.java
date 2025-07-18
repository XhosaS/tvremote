package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmt extends vuc implements vvk {
    public static final wmt a;
    private static volatile vvq e;
    public wla b;
    public wkx c;
    public wkx d;
    private int f;
    private byte g = 2;

    static {
        wmt wmtVar = new wmt();
        a = wmtVar;
        vuc.y(wmt.class, wmtVar);
    }

    private wmt() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0002\u0006ဉ\u0002\u0007ᐉ\u0003\bᐉ\u0004", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wmt();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmt.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
