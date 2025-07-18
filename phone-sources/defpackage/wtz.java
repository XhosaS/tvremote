package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtz extends vuc implements vvk {
    public static final wtz a;
    public static final vvd j;
    private static volatile vvq k;
    public wls b;
    public wls c;
    public int e;
    public wkg g;
    public boolean h;
    private int l;
    private byte m = 2;
    public vun d = vvt.a;
    public String f = "";
    public String i = "";

    static {
        wtz wtzVar = new wtz();
        a = wtzVar;
        vuc.y(wtz.class, wtzVar);
        j = vuc.C(wkx.a, wtzVar, wtzVar, 373860559, vwo.MESSAGE);
    }

    private wtz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0002\u0005ဈ\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bဈ\u0006", new Object[]{"l", "b", "c", "d", wlx.class, "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new wtz();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtz.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
