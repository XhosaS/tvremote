package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsl extends vuc implements vvk {
    public static final rsl a;
    private static volatile vvq d;
    public int b;
    public String c = "";
    private int e;

    static {
        rsl rslVar = new rsl();
        a = rslVar;
        vuc.y(rsl.class, rslVar);
    }

    private rsl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", kzn.h, "c"});
        }
        if (i2 == 3) {
            return new rsl();
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
        synchronized (rsl.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
