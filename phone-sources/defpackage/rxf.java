package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxf extends vuc implements vvk {
    public static final rxf a;
    private static volatile vvq j;
    public int b;
    public String c = "";
    public vsz d = vsz.b;
    public String e = "";
    public vun f;
    public vun g;
    public boolean h;
    public long i;

    static {
        rxf rxfVar = new rxf();
        a = rxfVar;
        vuc.y(rxf.class, rxfVar);
    }

    private rxf() {
        vvt vvtVar = vvt.a;
        this.f = vvtVar;
        this.g = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", rxg.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new rxf();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rxf.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
