package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmx extends vuc implements vvk {
    public static final tmx a;
    private static volatile vvq f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        tmx tmxVar = new tmx();
        a = tmxVar;
        vuc.y(tmx.class, tmxVar);
    }

    private tmx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tmx();
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
        synchronized (tmx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
