package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcw extends vuc implements vvk {
    public static final vcw a;
    private static volatile vvq e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        vcw vcwVar = new vcw();
        a = vcwVar;
        vuc.y(vcw.class, vcwVar);
    }

    private vcw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u00027\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "d", vcy.class, vda.class});
        }
        if (i2 == 3) {
            return new vcw();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vcw.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
