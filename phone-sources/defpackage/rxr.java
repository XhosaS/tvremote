package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxr extends vuc implements vvk {
    public static final vuk a = new qiu(5);
    public static final rxr b;
    private static volatile vvq m;
    public int c;
    public boolean e;
    public vun g;
    public vun h;
    public vuj i;
    public rxs j;
    public boolean k;
    public boolean l;
    public vsz d = vsz.b;
    public String f = "";

    static {
        rxr rxrVar = new rxr();
        b = rxrVar;
        vuc.y(rxr.class, rxrVar);
    }

    private rxr() {
        vvt vvtVar = vvt.a;
        this.g = vvtVar;
        this.h = vvtVar;
        this.i = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", ubu.s, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new rxr();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rxr.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
