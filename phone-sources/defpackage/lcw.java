package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcw extends vuc implements vvk {
    public static final lcw a;
    private static volatile vvq i;
    public int b;
    public vsz c = vsz.b;
    public lar d;
    public kzk e;
    public lcr f;
    public int g;
    public long h;

    static {
        lcw lcwVar = new lcw();
        a = lcwVar;
        vuc.y(lcw.class, lcwVar);
    }

    private lcw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003\f\u0004\u0002\u0005ဉ\u0001\u0006\n", new Object[]{"b", "d", "f", "g", "h", "e", "c"});
        }
        if (i3 == 3) {
            return new lcw();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcw.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
