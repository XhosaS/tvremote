package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pka extends vtz implements pkb {
    public static final pka a;
    private static volatile vvq i;
    public int b;
    public ucy d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public vuj c = vud.a;

    static {
        pka pkaVar = new pka();
        a = pkaVar;
        vuc.y(pka.class, pkaVar);
    }

    private pka() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", ubu.g, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new pka();
        }
        if (i3 == 4) {
            return new vty(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (pka.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
