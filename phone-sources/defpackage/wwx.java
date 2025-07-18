package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwx extends vuc implements vvk {
    public static final wwx a;
    private static volatile vvq e;
    public int b;
    public wom c;
    private byte f = 2;
    public vun d = vvt.a;

    static {
        wwx wwxVar = new wwx();
        a = wwxVar;
        vuc.y(wwx.class, wwxVar);
    }

    private wwx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", wlm.class});
        }
        if (i2 == 3) {
            return new wwx();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wwx.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
