package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvd extends vuc implements vvk {
    public static final wvd a;
    public static final vvd j;
    private static volatile vvq k;
    public wni b;
    public wlx e;
    public woc f;
    public wla g;
    public wls h;
    private int l;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        wvd wvdVar = new wvd();
        a = wvdVar;
        vuc.y(wvd.class, wvdVar);
        j = vuc.C(wkx.a, wvdVar, wvdVar, 350186401, vwo.MESSAGE);
    }

    private wvd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0002\f\b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\bဉ\u0006\tဈ\u0007\nဉ\u0005\u000bဉ\u0000\fဈ\u0002", new Object[]{"l", "c", "e", "f", "h", "i", "g", "b", "d"});
        }
        if (i2 == 3) {
            return new wvd();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wvd.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
