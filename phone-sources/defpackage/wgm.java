package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgm extends vuc implements vvk {
    public static final wgm a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public wgp e;
    public udi f;
    public int c = 0;
    private byte h = 2;

    static {
        wgm wgmVar = new wgm();
        a = wgmVar;
        vuc.y(wgm.class, wgmVar);
    }

    private wgm() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0002\u0004м\u0000\u0005ᐉ\u0004\u0006ဉ\u0001\u0007<\u0000", new Object[]{"d", "c", "b", wge.class, "f", "e", wgh.class});
        }
        if (i2 == 3) {
            return new wgm();
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
        synchronized (wgm.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
