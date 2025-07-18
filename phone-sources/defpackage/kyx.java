package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyx extends vuc implements vvk {
    public static final kyx a;
    private static volatile vvq f;
    public int b;
    public int c = 0;
    public Object d;
    public kzl e;

    static {
        kyx kyxVar = new kyx();
        a = kyxVar;
        vuc.y(kyx.class, kyxVar);
    }

    private kyx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", kzl.class, kyw.class});
        }
        if (i2 == 3) {
            return new kyx();
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
        synchronized (kyx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
