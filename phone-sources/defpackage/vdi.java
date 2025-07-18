package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdi extends vuc implements vvk {
    public static final vdi a;
    private static volatile vvq h;
    public int b;
    public int c;
    public String d = "";
    public vdh e;
    public vdm f;
    public vbt g;

    static {
        vdi vdiVar = new vdi();
        a = vdiVar;
        vuc.y(vdi.class, vdiVar);
    }

    private vdi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new vdi();
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
        synchronized (vdi.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
