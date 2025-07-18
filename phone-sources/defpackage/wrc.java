package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrc extends vuc implements vvk {
    public static final wrc a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public int c;
    public wls d;
    public wkg e;
    public wkv f;
    public wkv g;
    public wlx h;
    private byte k = 2;

    static {
        wrc wrcVar = new wrc();
        a = wrcVar;
        vuc.y(wrc.class, wrcVar);
        i = vuc.C(wkx.a, wrcVar, wrcVar, 421928812, vwo.MESSAGE);
    }

    private wrc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", wjk.h, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wrc();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wrc.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
