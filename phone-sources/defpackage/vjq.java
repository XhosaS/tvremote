package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjq extends vuc implements vvk {
    public static final vjq a;
    private static volatile vvq k;
    public int b;
    public int c;
    public vkk e;
    public vki g;
    public vjz h;
    public vme i;
    public String d = "";
    public vun f = vvt.a;
    public String j = "";

    static {
        vjq vjqVar = new vjq();
        a = vjqVar;
        vuc.y(vjq.class, vjqVar);
    }

    private vjq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001ဈ\u0001\u0003\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\n᠌\u0000\fဉ\u0005\rဈ\u0006", new Object[]{"b", "d", "f", "e", "g", "h", "c", vlj.h, "i", "j"});
        }
        if (i2 == 3) {
            return new vjq();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vjq.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
