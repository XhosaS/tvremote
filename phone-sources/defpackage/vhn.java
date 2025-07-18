package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhn extends vuc implements vvk {
    public static final vhn a;
    private static volatile vvq j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;

    static {
        vhn vhnVar = new vhn();
        a = vhnVar;
        vuc.y(vhn.class, vhnVar);
    }

    private vhn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", vgp.l});
        }
        if (i2 == 3) {
            return new vhn();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vhn.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
