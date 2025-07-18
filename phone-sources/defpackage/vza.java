package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vza extends vuc implements vvk {
    public static final vza a;
    private static volatile vvq e;
    public int c;
    public vsz b = vsz.b;
    public String d = "";

    static {
        vza vzaVar = new vza();
        a = vzaVar;
        vuc.y(vza.class, vzaVar);
    }

    private vza() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\f\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new vza();
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
        synchronized (vza.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
