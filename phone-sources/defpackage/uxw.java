package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxw extends vuc implements vvk {
    public static final uxw a;
    private static volatile vvq k;
    public int b;
    public Object d;
    public int e;
    public wes g;
    public wes h;
    public int j;
    public int c = 0;
    public String f = "";
    public vun i = vvt.a;

    static {
        uxw uxwVar = new uxw();
        a = uxwVar;
        vuc.y(uxw.class, uxwVar);
    }

    private uxw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0001\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003;\u0000\u0006ဉ\u0002\b<\u0000\t᠌\u0004\nဉ\u0003\u000b\u001b\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", uvj.t, "f", "g", uxf.class, "j", uvj.s, "h", "i", uyw.class, uxs.class, uyi.class});
        }
        if (i2 == 3) {
            return new uxw();
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
        synchronized (uxw.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
