package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tna extends vuc implements vvk {
    public static final tna a;
    private static volatile vvq d;
    public int b;
    public vun c = vvt.a;
    private int e;

    static {
        tna tnaVar = new tna();
        a = tnaVar;
        vuc.y(tna.class, tnaVar);
    }

    private tna() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"e", "b", "c", tmz.class});
        }
        if (i2 == 3) {
            return new tna();
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
        synchronized (tna.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
