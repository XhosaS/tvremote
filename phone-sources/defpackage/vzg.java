package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzg extends vuc implements vvk {
    public static final vzg a;
    private static volatile vvq i;
    public val b;
    public vzh c;
    public wac d;
    public vam e;
    public vzr f;
    public wat g;
    public vun h = vvt.a;
    private int j;

    static {
        vzg vzgVar = new vzg();
        a = vzgVar;
        vuc.y(vzg.class, vzgVar);
    }

    private vzg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006\u001b\u0007ဉ\u0001", new Object[]{"j", "b", "d", "e", "f", "g", "h", vaj.class, "c"});
        }
        if (i3 == 3) {
            return new vzg();
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
        synchronized (vzg.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
