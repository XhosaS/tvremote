package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdw extends vuc implements vvk {
    public static final wdw a;
    private static volatile vvq d;
    public int b;
    public int c;

    static {
        wdw wdwVar = new wdw();
        a = wdwVar;
        vuc.y(wdw.class, wdwVar);
    }

    private wdw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new wdw();
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
        synchronized (wdw.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
