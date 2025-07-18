package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class vjf extends vuc implements vvk {
    public static final vjf a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public long d;

    static {
        vjf vjfVar = new vjf();
        a = vjfVar;
        vuc.y(vjf.class, vjfVar);
    }

    private vjf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"b", "d", "c", vlq.class});
        }
        if (i2 == 3) {
            return new vjf();
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
        synchronized (vjf.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
