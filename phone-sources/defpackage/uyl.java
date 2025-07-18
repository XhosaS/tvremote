package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyl extends vuc implements vvk {
    public static final uyl a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        uyl uylVar = new uyl();
        a = uylVar;
        vuc.y(uyl.class, uylVar);
    }

    private uyl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003\u083f\u0000\u00047\u0000\u0005:\u0000", new Object[]{"d", "c", "b", "e", uxz.g});
        }
        if (i2 == 3) {
            return new uyl();
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
        synchronized (uyl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
