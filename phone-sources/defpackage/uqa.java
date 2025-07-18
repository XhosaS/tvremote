package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqa extends vuc implements vvk {
    public static final uqa a;
    public static final vvd d;
    private static volatile vvq e;
    public int b;
    public vsz c = vsz.b;

    static {
        uqa uqaVar = new uqa();
        a = uqaVar;
        vuc.y(uqa.class, uqaVar);
        d = vuc.C(wdy.a, uqaVar, uqaVar, 202735639, vwo.MESSAGE);
    }

    private uqa() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new uqa();
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
        synchronized (uqa.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
