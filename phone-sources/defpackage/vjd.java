package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjd extends vuc implements vvk {
    public static final vjd a;
    private static volatile vvq f;
    public vun b;
    public vun c;
    public long d;
    public long e;
    private int g;

    static {
        vjd vjdVar = new vjd();
        a = vjdVar;
        vuc.y(vjd.class, vjdVar);
    }

    private vjd() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0004\t\u0004\u0000\u0002\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0007\u001b\t\u001b", new Object[]{"g", "d", "e", "b", vlq.class, "c", vlm.class});
        }
        if (i2 == 3) {
            return new vjd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vjd.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
