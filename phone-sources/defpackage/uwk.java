package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwk extends vuc implements vvk {
    public static final uwk a;
    private static volatile vvq e;
    public int b;
    public int c;
    public vtl d;

    static {
        uwk uwkVar = new uwk();
        a = uwkVar;
        vuc.y(uwk.class, uwkVar);
    }

    private uwk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new uwk();
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
        synchronized (uwk.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
