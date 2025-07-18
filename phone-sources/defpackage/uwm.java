package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwm extends vuc implements vvk {
    public static final uwm a;
    private static volatile vvq d;
    public int b;
    public vuj c = vud.a;

    static {
        uwm uwmVar = new uwm();
        a = uwmVar;
        vuc.y(uwm.class, uwmVar);
    }

    private uwm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new uwm();
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
        synchronized (uwm.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
