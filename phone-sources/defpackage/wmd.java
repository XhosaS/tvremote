package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmd extends vuc implements vvk {
    public static final wmd a;
    private static volatile vvq h;
    public int b;
    public wos d;
    public wnb e;
    public wkx f;
    public wkx g;
    private byte i = 2;
    public vun c = vvt.a;

    static {
        wmd wmdVar = new wmd();
        a = wmdVar;
        vuc.y(wmd.class, wmdVar);
    }

    private wmd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001\u001b\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0000\u0007ဉ\u0002", new Object[]{"b", "c", wnv.class, "f", "g", "d", "e"});
        }
        if (i2 == 3) {
            return new wmd();
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
        synchronized (wmd.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
