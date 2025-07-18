package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucs extends vuc implements vvk {
    public static final ucs a;
    private static volatile vvq k;
    public int b;
    public ucv c;
    public long d;
    public vun e;
    public vun f;
    public vun g;
    public vun h;
    public vun i;
    public int j;

    static {
        ucs ucsVar = new ucs();
        a = ucsVar;
        vuc.y(ucs.class, ucsVar);
    }

    private ucs() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.f = vvtVar;
        this.g = vvtVar;
        this.h = vvtVar;
        this.i = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"b", "c", "d", "e", ucr.class, "f", ucp.class, "g", ucu.class, "h", uct.class, "i", ucq.class, "j"});
        }
        if (i2 == 3) {
            return new ucs();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucs.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
