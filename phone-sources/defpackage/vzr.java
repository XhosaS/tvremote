package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzr extends vuc implements vvk {
    public static final vuk a = new vzp(0);
    public static final vzr b;
    private static volatile vvq k;
    public boolean c;
    public int d;
    public vuj e = vud.a;
    public vun f;
    public vun g;
    public vtl h;
    public vtl i;
    public boolean j;
    private int l;

    static {
        vzr vzrVar = new vzr();
        b = vzrVar;
        vuc.y(vzr.class, vzrVar);
    }

    private vzr() {
        vvt vvtVar = vvt.a;
        this.f = vvtVar;
        this.g = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001\u0007\u0002\f\u0003,\u0005\u001b\u0006\u001b\u0007ဉ\u0000\bဉ\u0001\n\u0007", new Object[]{"l", "c", "d", "e", "f", vzn.class, "g", vzo.class, "h", "i", "j"});
        }
        if (i2 == 3) {
            return new vzr();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vzr.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
