package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtj extends vuc implements vvk {
    public static final wtj a;
    public static final vvd j;
    private static volatile vvq k;
    public wls b;
    public wls c;
    public wlx d;
    public wls e;
    public wls f;
    public wkg g;
    public boolean h;
    private int l;
    private byte m = 2;
    public String i = "";

    static {
        wtj wtjVar = new wtj();
        a = wtjVar;
        vuc.y(wtj.class, wtjVar);
        j = vuc.C(wkx.a, wtjVar, wtjVar, 374213029, vwo.MESSAGE);
    }

    private wtj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006\bဈ\u0007", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new wtj();
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
        synchronized (wtj.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
