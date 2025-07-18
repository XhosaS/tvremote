package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tne extends vuc implements vvk {
    public static final tne a;
    private static volatile vvq d;
    public boolean b;
    public tnd c;
    private int e;

    static {
        tne tneVar = new tne();
        a = tneVar;
        vuc.y(tne.class, tneVar);
    }

    private tne() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new tne();
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
        synchronized (tne.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
