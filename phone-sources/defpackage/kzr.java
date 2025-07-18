package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzr extends vuc implements vvk {
    public static final kzr a;
    private static volatile vvq f;
    public String b = "";
    public boolean c;
    public int d;
    public int e;

    static {
        kzr kzrVar = new kzr();
        a = kzrVar;
        vuc.y(kzr.class, kzrVar);
    }

    private kzr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new kzr();
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
        synchronized (kzr.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
