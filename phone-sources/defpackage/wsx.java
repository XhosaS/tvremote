package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsx extends vuc implements vvk {
    public static final wsx a;
    public static final vvd c;
    private static volatile vvq d;
    public wly b;
    private int e;
    private byte f = 2;

    static {
        wsx wsxVar = new wsx();
        a = wsxVar;
        vuc.y(wsx.class, wsxVar);
        c = vuc.C(wkx.a, wsxVar, wsxVar, 516388060, vwo.MESSAGE);
    }

    private wsx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "b"});
        }
        if (i2 == 3) {
            return new wsx();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wsx.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
