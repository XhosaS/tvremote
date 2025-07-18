package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vec extends vuc implements vvk {
    public static final vec a;
    private static volatile vvq d;
    public vdo b;
    public ved c;
    private int e;

    static {
        vec vecVar = new vec();
        a = vecVar;
        vuc.y(vec.class, vecVar);
    }

    private vec() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new vec();
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
        synchronized (vec.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
