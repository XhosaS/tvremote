package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wts extends vuc implements vvk {
    public static final wts a;
    public static final vvd i;
    private static volatile vvq j;
    public wls b;
    public wls c;
    public wtn d;
    public wkg e;
    public wtr f;
    public wtq g;
    public wto h;
    private int k;
    private byte l = 2;

    static {
        wts wtsVar = new wts();
        a = wtsVar;
        vuc.y(wts.class, wtsVar);
        i = vuc.C(wkx.a, wtsVar, wtsVar, 470104850, vwo.MESSAGE);
    }

    private wts() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0002\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဉ\u0001\u0007ᐉ\u0003", new Object[]{"k", "b", "d", "f", "g", "h", "c", "e"});
        }
        if (i3 == 3) {
            return new wts();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wts.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
