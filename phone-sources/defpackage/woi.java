package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woi extends vuc implements vvk {
    public static final woi a;
    private static volatile vvq f;
    public int b;
    public wkx e;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        woi woiVar = new woi();
        a = woiVar;
        vuc.y(woi.class, woiVar);
    }

    private woi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ᐉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new woi();
        }
        if (i2 == 4) {
            return new vtw(a);
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
        synchronized (woi.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
