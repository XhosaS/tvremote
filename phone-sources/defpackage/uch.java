package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uch extends vuc implements vvk {
    public static final uch a;
    private static volatile vvq f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        uch uchVar = new uch();
        a = uchVar;
        vuc.y(uch.class, uchVar);
    }

    private uch() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new uch();
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
        synchronized (uch.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
