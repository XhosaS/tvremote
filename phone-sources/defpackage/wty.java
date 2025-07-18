package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wty extends vuc implements vvk {
    public static final wty a;
    public static final vvd h;
    private static volatile vvq i;
    public wls b;
    public wls c;
    public int e;
    public boolean f;
    private int j;
    public vun d = vvt.a;
    public String g = "";

    static {
        wty wtyVar = new wty();
        a = wtyVar;
        vuc.y(wty.class, wtyVar);
        h = vuc.C(wkx.a, wtyVar, wtyVar, 373861257, vwo.MESSAGE);
    }

    private wty() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"j", "b", "c", "d", wlx.class, "e", "f", "g"});
        }
        if (i3 == 3) {
            return new wty();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wty.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
