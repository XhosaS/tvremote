package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcv extends vuc implements vvk {
    public static final lcv a;
    private static volatile vvq g;
    public float b;
    public long c;
    public float d;
    public int e;
    public String f = "";

    static {
        lcv lcvVar = new lcv();
        a = lcvVar;
        vuc.y(lcv.class, lcvVar);
    }

    private lcv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0002\u0003\u0001\u0005\f\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lcv();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcv.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
