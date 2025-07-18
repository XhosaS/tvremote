package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzq extends vuc implements vvk {
    public static final wzq a;
    private static volatile vvq g;
    public int b;
    public wni c;
    public wnj d;
    public wzp e;
    public vwe f;

    static {
        wzq wzqVar = new wzq();
        a = wzqVar;
        vuc.y(wzq.class, wzqVar);
    }

    private wzq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (i2 == 3) {
            return new wzq();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wzq.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
