package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vay extends vuc implements vvk {
    public static final vay a;
    private static volatile vvq h;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        vay vayVar = new vay();
        a = vayVar;
        vuc.y(vay.class, vayVar);
    }

    private vay() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", vav.class, vax.class});
        }
        if (i2 == 3) {
            return new vay();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vay.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
