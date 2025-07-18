package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxo extends vuc implements vvk {
    public static final uxo a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        uxo uxoVar = new uxo();
        a = uxoVar;
        vuc.y(uxo.class, uxoVar);
    }

    private uxo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", uxm.class});
        }
        if (i2 == 3) {
            return new uxo();
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
        synchronized (uxo.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
