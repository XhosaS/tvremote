package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzf extends vuc implements vvk {
    public static final uzf a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public uzd d;

    static {
        uzf uzfVar = new uzf();
        a = uzfVar;
        vuc.y(uzf.class, uzfVar);
    }

    private uzf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", uze.class, "d"});
        }
        if (i2 == 3) {
            return new uzf();
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
        synchronized (uzf.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
