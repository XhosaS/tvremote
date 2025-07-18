package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uva extends vuc implements vvk {
    public static final uva a;
    private static volatile vvq d;
    public int b;
    public int c;

    static {
        uva uvaVar = new uva();
        a = uvaVar;
        vuc.y(uva.class, uvaVar);
    }

    private uva() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", uvj.b});
        }
        if (i2 == 3) {
            return new uva();
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
        synchronized (uva.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
