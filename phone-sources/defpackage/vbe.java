package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbe extends vuc implements vvk {
    public static final vbe a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        vbe vbeVar = new vbe();
        a = vbeVar;
        vuc.y(vbe.class, vbeVar);
    }

    private vbe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", vbd.class, vbc.class});
        }
        if (i2 == 3) {
            return new vbe();
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
        synchronized (vbe.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
