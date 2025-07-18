package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzp extends vuc implements vvk {
    public static final wzp a;
    private static volatile vvq e;
    public int b;
    public wni c;
    public wni d;

    static {
        wzp wzpVar = new wzp();
        a = wzpVar;
        vuc.y(wzp.class, wzpVar);
    }

    private wzp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wzp();
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
        synchronized (wzp.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
