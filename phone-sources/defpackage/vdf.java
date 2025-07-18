package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdf extends vuc implements vvk {
    public static final vdf a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        vdf vdfVar = new vdf();
        a = vdfVar;
        vuc.y(vdf.class, vdfVar);
    }

    private vdf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000", new Object[]{"c", "b", vdg.class});
        }
        if (i2 == 3) {
            return new vdf();
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
        synchronized (vdf.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
