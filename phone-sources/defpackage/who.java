package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class who extends vtz implements vua {
    public static final who a;
    private static volatile vvq f;
    public int b;
    public wdx c;
    public int d;
    public uzj e;
    private byte g = 2;

    static {
        who whoVar = new who();
        a = whoVar;
        vuc.y(who.class, whoVar);
    }

    private who() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", wdp.t, "e"});
        }
        if (i2 == 3) {
            return new who();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (who.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
