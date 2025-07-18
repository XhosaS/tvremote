package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzv extends vuc implements vvk {
    public static final uzv a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        uzv uzvVar = new uzv();
        a = uzvVar;
        vuc.y(uzv.class, uzvVar);
    }

    private uzv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", uzt.class, uzu.class});
        }
        if (i2 == 3) {
            return new uzv();
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
        synchronized (uzv.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
