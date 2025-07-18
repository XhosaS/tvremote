package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjx extends vuc implements vvk {
    public static final vjx a;
    private static volatile vvq e;
    public viu b;
    public int c;
    public int d;
    private int f;

    static {
        vjx vjxVar = new vjx();
        a = vjxVar;
        vuc.y(vjx.class, vjxVar);
    }

    private vjx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"f", "b", "c", vid.j, "d", vid.k});
        }
        if (i2 == 3) {
            return new vjx();
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
        synchronized (vjx.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
