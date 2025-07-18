package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uci extends vtz implements vua {
    public static final uci a;
    private static volatile vvq k;
    public int b;
    public ucy c;
    public int e;
    public int f;
    public int g;
    public uan j;
    private byte m = 2;
    public int d = -1;
    public int h = -1;
    public vun i = vvt.a;

    static {
        uci uciVar = new uci();
        a = uciVar;
        vuc.y(uci.class, uciVar);
    }

    private uci() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", ucj.class, "j", "c"});
        }
        if (i2 == 3) {
            return new uci();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uci.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
