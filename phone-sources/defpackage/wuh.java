package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuh extends vuc implements vvk {
    public static final wuh a;
    public static final vvd j;
    private static volatile vvq k;
    public wll b;
    public int c;
    public wlx d;
    public wls f;
    public wls g;
    public wni i;
    private int l;
    public String e = "";
    public String h = "";

    static {
        wuh wuhVar = new wuh();
        a = wuhVar;
        vuc.y(wuh.class, wuhVar);
        j = vuc.C(wkx.a, wuhVar, wuhVar, 357999819, vwo.MESSAGE);
    }

    private wuh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007", new Object[]{"l", "b", "c", wjk.p, "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new wuh();
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
        synchronized (wuh.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
