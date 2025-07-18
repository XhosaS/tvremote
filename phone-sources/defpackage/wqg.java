package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqg extends vuc implements vvk {
    public static final wqg a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public Object d;
    public wpd e;
    public boolean f;
    public woi g;
    public boolean h;
    public int c = 0;
    private byte k = 2;

    static {
        wqg wqgVar = new wqg();
        a = wqgVar;
        vuc.y(wqg.class, wqgVar);
        i = vuc.C(wkg.a, wqgVar, wqgVar, 350411639, vwo.MESSAGE);
    }

    private wqg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001<\u0000\u0003ဉ\u0001\u0004<\u0000\u0005ဇ\u0002\u0006ᐉ\u0003\u0007ဇ\u0004", new Object[]{"d", "c", "b", wll.class, "e", wni.class, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wqg();
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
        synchronized (wqg.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
