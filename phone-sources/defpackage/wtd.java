package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtd extends vuc implements vvk {
    public static final wtd a;
    public static final vvd j;
    private static volatile vvq k;
    public wlx b;
    public wls c;
    public wls d;
    public wkg f;
    public vwe g;
    public vwe h;
    private int l;
    private byte m = 2;
    public String e = "";
    public String i = "";

    static {
        wtd wtdVar = new wtd();
        a = wtdVar;
        vuc.y(wtd.class, wtdVar);
        j = vuc.C(wkx.a, wtdVar, wtdVar, 525000001, vwo.MESSAGE);
    }

    private wtd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\bဉ\u0007\tဉ\b\nဈ\t", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new wtd();
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
        synchronized (wtd.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
