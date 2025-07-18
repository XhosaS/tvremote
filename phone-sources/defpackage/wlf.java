package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlf extends vuc implements vvk {
    public static final wlf a;
    private static volatile vvq j;
    public int b;
    public Object d;
    public int g;
    public wle h;
    public wmc i;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public String f = "";

    static {
        wlf wlfVar = new wlf();
        a = wlfVar;
        vuc.y(wlf.class, wlfVar);
    }

    private wlf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001Ȉ\u0002\f\u0003м\u0000\u0004м\u0000\u0005Ȉ\u0006ဉ\u0001\u0007ဉ\u0000", new Object[]{"d", "c", "b", "f", "g", wkx.class, woq.class, "e", "i", "h"});
        }
        if (i2 == 3) {
            return new wlf();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wlf.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
