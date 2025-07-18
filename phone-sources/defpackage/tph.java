package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tph extends vuc implements vvk {
    public static final tph a;
    private static volatile vvq e;
    public int b;
    public int c;
    public long d;
    private int f;

    static {
        tph tphVar = new tph();
        a = tphVar;
        vuc.y(tph.class, tphVar);
    }

    private tph() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0003ဂ\u0003\u0004င\u0002", new Object[]{"f", "b", "d", "c"});
        }
        if (i2 == 3) {
            return new tph();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tph.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
