package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjy extends vtz implements vua {
    public static final pjy a;
    private static volatile vvq e;
    public int b;
    public int c;
    private byte f = 2;
    public vuj d = vud.a;

    static {
        pjy pjyVar = new pjy();
        a = pjyVar;
        vuc.y(pjy.class, pjyVar);
    }

    private pjy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"b", "c", ubu.q, "d"});
        }
        if (i2 == 3) {
            return new pjy();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (pjy.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
