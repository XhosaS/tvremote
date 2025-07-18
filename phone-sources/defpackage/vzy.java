package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzy extends vuc implements vvk {
    public static final vzy a;
    private static volatile vvq e;
    public val b;
    public val c;
    public String d = "";
    private int f;

    static {
        vzy vzyVar = new vzy();
        a = vzyVar;
        vuc.y(vzy.class, vzyVar);
    }

    private vzy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new vzy();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vzy.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
