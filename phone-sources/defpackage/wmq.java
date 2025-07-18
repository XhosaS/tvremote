package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmq extends vuc implements vvk {
    public static final wmq a;
    private static volatile vvq f;
    public wlx c;
    public wla d;
    public wkx e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        wmq wmqVar = new wmq();
        a = wmqVar;
        vuc.y(wmq.class, wmqVar);
    }

    private wmq() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ᐉ\u0002", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wmq();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmq.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
