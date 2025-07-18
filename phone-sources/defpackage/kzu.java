package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzu extends vuc implements vvk {
    public static final kzu a;
    private static volatile vvq c;
    public String b = "";

    static {
        kzu kzuVar = new kzu();
        a = kzuVar;
        vuc.y(kzu.class, kzuVar);
    }

    private kzu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new kzu();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (kzu.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
