package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpm extends vuc implements vvk {
    public static final wpm a;
    private static volatile vvq i;
    public int b;
    public int c = 0;
    public Object d;
    public wld e;
    public wls f;
    public wpl g;
    public wld h;

    static {
        wpm wpmVar = new wpm();
        a = wpmVar;
        vuc.y(wpm.class, wpmVar);
    }

    private wpm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001\u0007ဉ\u0002\bဉ\u0003", new Object[]{"d", "c", "b", "e", wlt.class, won.class, woz.class, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wpm();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wpm.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
