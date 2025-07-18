package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmr extends vuc implements vvk {
    public static final wmr a;
    private static volatile vvq g;
    public wlx c;
    public wla d;
    public wkx e;
    public wkx f;
    private int h;
    private byte i = 2;
    public String b = "";

    static {
        wmr wmrVar = new wmr();
        a = wmrVar;
        vuc.y(wmr.class, wmrVar);
    }

    private wmr() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0002\u0001Ȉ\u0002ဉ\u0000\u0006ဉ\u0002\u0007ᐉ\u0003\bᐉ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wmr();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmr.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
