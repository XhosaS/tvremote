package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wst extends vuc implements vvk {
    public static final wst a;
    private static volatile vvq c;
    private byte d = 2;
    public vun b = vvt.a;

    static {
        wst wstVar = new wst();
        a = wstVar;
        vuc.y(wst.class, wstVar);
    }

    private wst() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", wkx.class});
        }
        if (i2 == 3) {
            return new wst();
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
        synchronized (wst.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
