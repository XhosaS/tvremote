package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wry extends vuc implements vvk {
    public static final wry a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public wls c;
    public wls d;
    public wls e;
    public wkg f;
    public boolean g;
    public int h;
    private byte k = 2;

    static {
        wry wryVar = new wry();
        a = wryVar;
        vuc.y(wry.class, wryVar);
        i = vuc.C(wkx.a, wryVar, wryVar, 525000003, vwo.MESSAGE);
    }

    private wry() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wry();
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
        synchronized (wry.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
