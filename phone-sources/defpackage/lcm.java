package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcm extends vuc implements vvk {
    public static final lcm a;
    private static volatile vvq d;
    public int b;
    public int c;

    static {
        lcm lcmVar = new lcm();
        a = lcmVar;
        vuc.y(lcm.class, lcmVar);
    }

    private lcm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lcm();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcm.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
