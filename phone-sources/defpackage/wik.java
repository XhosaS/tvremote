package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wik extends vuc implements vvk {
    public static final wik a;
    private static volatile vvq i;
    public int b;
    public int c;
    public int d;
    public boolean f;
    public int g;
    public String e = "";
    public String h = "";

    static {
        wik wikVar = new wik();
        a = wikVar;
        vuc.y(wik.class, wikVar);
    }

    private wik() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", wia.g, "d", wia.f, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wik();
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
        synchronized (wik.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
