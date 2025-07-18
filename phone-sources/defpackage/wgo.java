package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgo extends vuc implements vvk {
    public static final wgo a;
    private static volatile vvq e;
    public int b;
    public wgp c;
    public udi d;
    private byte f = 2;

    static {
        wgo wgoVar = new wgo();
        a = wgoVar;
        vuc.y(wgo.class, wgoVar);
    }

    private wgo() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ᐉ\u0004\u0005ဉ\u0001", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new wgo();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wgo.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
