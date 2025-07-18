package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ink extends vuc implements vvk {
    public static final ink a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public wjz e;
    public int c = 0;
    private byte h = 2;
    public String f = "";

    static {
        ink inkVar = new ink();
        a = inkVar;
        vuc.y(ink.class, inkVar);
    }

    private ink() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0011\u0001\u0001\u0001\u0011\u0011\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\tဉ\u0000\nȈ\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"d", "c", "b", wvu.class, wwy.class, wwq.class, wws.class, www.class, wwu.class, wwe.class, wvy.class, "e", "f", wzb.class, wxa.class, wwg.class, wwo.class, wwm.class, wvw.class, wxc.class});
        }
        if (i2 == 3) {
            return new ink();
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
        synchronized (ink.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
