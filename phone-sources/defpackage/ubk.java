package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubk extends vuc implements vvk {
    public static final ubk a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ubk ubkVar = new ubk();
        a = ubkVar;
        vuc.y(ubk.class, ubkVar);
    }

    private ubk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006ဈ\u0001", new Object[]{"d", "c", "b", ubi.class, ube.class, ubd.class, ubj.class, "e"});
        }
        if (i2 == 3) {
            return new ubk();
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
        synchronized (ubk.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
