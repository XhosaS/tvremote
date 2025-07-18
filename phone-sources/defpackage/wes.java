package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wes extends vuc implements vvk {
    public static final wes a;
    private static volatile vvq g;
    public int b;
    public float c;
    public float d;
    public float e;
    public vtu f;

    static {
        wes wesVar = new wes();
        a = wesVar;
        vuc.y(wes.class, wesVar);
    }

    private wes() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wes();
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
        synchronized (wes.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
