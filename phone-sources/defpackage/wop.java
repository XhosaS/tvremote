package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wop extends vuc implements vvk {
    public static final wop a;
    private static volatile vvq g;
    public int b;
    public wkx e;
    public wmc f;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        wop wopVar = new wop();
        a = wopVar;
        vuc.y(wop.class, wopVar);
    }

    private wop() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ᐉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wop();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wop.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
