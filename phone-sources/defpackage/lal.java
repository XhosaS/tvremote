package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lal extends vuc implements vvk {
    public static final lal a;
    private static volatile vvq c;
    public String b = "";

    static {
        lal lalVar = new lal();
        a = lalVar;
        vuc.y(lal.class, lalVar);
    }

    private lal() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new lal();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lal.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
