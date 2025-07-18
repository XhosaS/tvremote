package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ord extends vuc implements vvk {
    public static final ord a;
    private static volatile vvq f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        ord ordVar = new ord();
        a = ordVar;
        vuc.y(ord.class, ordVar);
    }

    private ord() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ord();
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
        synchronized (ord.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
