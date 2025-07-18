package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyz extends vuc implements vvk {
    public static final vyz a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public val e;
    public int c = 0;
    public String f = "";

    static {
        vyz vyzVar = new vyz();
        a = vyzVar;
        vuc.y(vyz.class, vyzVar);
    }

    private vyz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0000\u0007Ȉ", new Object[]{"d", "c", "b", vyw.class, vyu.class, vyv.class, vyy.class, vyx.class, "e", "f"});
        }
        if (i2 == 3) {
            return new vyz();
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
        synchronized (vyz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
