package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnd extends vuc implements vvk {
    public static final tnd a;
    private static volatile vvq i;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public String d = "";
    public String h = "";

    static {
        tnd tndVar = new tnd();
        a = tndVar;
        vuc.y(tnd.class, tndVar);
    }

    private tnd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new tnd();
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
        synchronized (tnd.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
