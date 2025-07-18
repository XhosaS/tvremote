package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vca extends vuc implements vvk {
    public static final vca a;
    private static volatile vvq f;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        vca vcaVar = new vca();
        a = vcaVar;
        vuc.y(vca.class, vcaVar);
    }

    private vca() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new vca();
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
        synchronized (vca.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
