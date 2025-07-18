package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upz extends vuc implements vvk {
    public static final upz a;
    public static final vvd c;
    private static volatile vvq d;
    public vun b = vvt.a;

    static {
        upz upzVar = new upz();
        a = upzVar;
        vuc.y(upz.class, upzVar);
        c = vuc.C(wdy.a, upzVar, upzVar, 198889211, vwo.MESSAGE);
    }

    private upz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new upz();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (upz.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
