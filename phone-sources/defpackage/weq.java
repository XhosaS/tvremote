package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class weq extends vuc implements vvk {
    public static final weq a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        weq weqVar = new weq();
        a = weqVar;
        vuc.y(weq.class, weqVar);
    }

    private weq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", vsl.class});
        }
        if (i2 == 3) {
            return new weq();
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
        synchronized (weq.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
