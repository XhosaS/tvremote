package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvv extends vuc implements vvk {
    public static final uvv a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        uvv uvvVar = new uvv();
        a = uvvVar;
        vuc.y(uvv.class, uvvVar);
    }

    private uvv() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000\u0003ဈ\u0000\u0004;\u0000\u0005ဈ\u0001\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", uvj.a, "e", "f", uvx.class, uvw.class});
        }
        if (i2 == 3) {
            return new uvv();
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
        synchronized (uvv.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
