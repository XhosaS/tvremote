package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxq extends vuc implements vvk {
    public static final vuk a = new qiu(4);
    public static final rxq b;
    private static volatile vvq n;
    public int c;
    public boolean e;
    public long g;
    public vun h;
    public vun i;
    public vuj j;
    public rxs k;
    public boolean l;
    public boolean m;
    public vsz d = vsz.b;
    public String f = "";

    static {
        rxq rxqVar = new rxq();
        b = rxqVar;
        vuc.y(rxq.class, rxqVar);
    }

    private rxq() {
        vvt vvtVar = vvt.a;
        this.h = vvtVar;
        this.i = vvtVar;
        this.j = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", ubu.s, "k", "l", "m"});
        }
        if (i2 == 3) {
            return new rxq();
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
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rxq.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
