package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkp extends vuc implements vvk {
    public static final wkp a;
    private static volatile vvq f;
    public boolean b;
    public wph c;
    public wls d;
    public int e;
    private int g;
    private vve h = vve.a;
    private byte i = 2;

    static {
        wkp wkpVar = new wkp();
        a = wkpVar;
        vuc.y(wkp.class, wkpVar);
    }

    private wkp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0001\u0001\u0007\u0002ᐉ\u0000\u0003ဉ\u0001\u0004\f\u00052", new Object[]{"g", "b", "c", "d", "e", "h", wko.a});
        }
        if (i2 == 3) {
            return new wkp();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wkp.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
