package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnw extends vuc implements vvk {
    public static final vnw a;
    private static volatile vvq f;
    public int b;
    public boolean c;
    public vnl d;
    public vnv e;

    static {
        vnw vnwVar = new vnw();
        a = vnwVar;
        vuc.y(vnw.class, vnwVar);
    }

    private vnw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new vnw();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vnw.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
