package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vde extends vuc implements vvk {
    public static final vde a;
    private static volatile vvq f;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";

    static {
        vde vdeVar = new vde();
        a = vdeVar;
        vuc.y(vde.class, vdeVar);
    }

    private vde() {
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
            return new vvu(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"c", "b", vdd.class, "d", "e"});
        }
        if (i2 == 3) {
            return new vde();
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
        synchronized (vde.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
