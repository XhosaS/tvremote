package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjb extends vuc implements vvk {
    public static final wjb a;
    private static volatile vvq b;
    private int c;
    private uda d;
    private wge e;
    private byte f = 2;

    static {
        wjb wjbVar = new wjb();
        a = wjbVar;
        vuc.y(wjb.class, wjbVar);
    }

    private wjb() {
        vud vudVar = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0007\t\u0002\u0000\u0000\u0002\u0007ᐉ\u0001\tᐉ\u0003", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new wjb();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wjb.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
