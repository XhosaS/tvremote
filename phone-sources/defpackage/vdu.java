package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdu extends vuc implements vvk {
    public static final vdu a;
    private static volatile vvq d;
    public val b;
    public String c = "";
    private int e;

    static {
        vdu vduVar = new vdu();
        a = vduVar;
        vuc.y(vdu.class, vduVar);
    }

    private vdu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003Ȉ", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new vdu();
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
        synchronized (vdu.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
