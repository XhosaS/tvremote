package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgy extends vuc implements vvk {
    public static final wgy a;
    private static volatile vvq h;
    public int b;
    public wgo d;
    public wgm e;
    public wgk f;
    public wgx g;
    private byte i = 2;
    public vun c = vvt.a;

    static {
        wgy wgyVar = new wgy();
        a = wgyVar;
        vuc.y(wgy.class, wgyVar);
    }

    private wgy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", wgy.class, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new wgy();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wgy.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.c;
        if (vunVar.c()) {
            return;
        }
        this.c = vuc.s(vunVar);
    }
}
