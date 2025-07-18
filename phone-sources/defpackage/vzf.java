package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzf extends vuc implements vvk {
    public static final vzf a;
    private static volatile vvq e;
    public int b = 0;
    public Object c;
    public vdo d;
    private int f;

    static {
        vzf vzfVar = new vzf();
        a = vzfVar;
        vuc.y(vzf.class, vzfVar);
    }

    private vzf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "f", "d", vzb.class, vze.class});
        }
        if (i2 == 3) {
            return new vzf();
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
        synchronized (vzf.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
