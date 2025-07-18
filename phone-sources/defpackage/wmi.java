package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmi extends vuc implements vvk {
    public static final wmi a;
    private static volatile vvq c;
    public int b;
    private wmh d;

    static {
        wmi wmiVar = new wmi();
        a = wmiVar;
        vuc.y(wmi.class, wmiVar);
    }

    private wmi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "d"});
        }
        if (i2 == 3) {
            return new wmi();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmi.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
