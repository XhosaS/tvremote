package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upy extends vuc implements vvk {
    public static final upy a;
    public static final vvd b;
    private static volatile vvq c;

    static {
        upy upyVar = new upy();
        a = upyVar;
        vuc.y(upy.class, upyVar);
        b = vuc.C(wdy.a, upyVar, upyVar, 203522521, vwo.MESSAGE);
    }

    private upy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new upy();
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
        synchronized (upy.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
