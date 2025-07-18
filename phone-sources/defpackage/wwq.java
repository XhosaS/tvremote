package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwq extends vuc implements vvk {
    public static final wwq a;
    private static volatile vvq f;
    public int b;
    public wom e;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        wwq wwqVar = new wwq();
        a = wwqVar;
        vuc.y(wwq.class, wwqVar);
    }

    private wwq() {
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
            return new wwq();
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
        synchronized (wwq.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
