package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wug extends vuc implements vvk {
    public static final wug a;
    private static volatile vvq c;
    private byte d = 2;
    public vun b = vvt.a;

    static {
        wug wugVar = new wug();
        a = wugVar;
        vuc.y(wug.class, wugVar);
    }

    private wug() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", wuf.class});
        }
        if (i2 == 3) {
            return new wug();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wug.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
