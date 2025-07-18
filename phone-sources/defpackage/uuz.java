package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuz extends vuc implements vvk {
    public static final uuz a;
    private static volatile vvq j;
    public int b;
    public int c;
    public long d;
    public yzi e;
    public uuw f;
    public udb g;
    public vun h;
    public uuy i;
    private byte k = 2;

    static {
        uuz uuzVar = new uuz();
        a = uuzVar;
        vuc.y(uuz.class, uuzVar);
    }

    private uuz() {
        vsz vszVar = vsz.b;
        this.h = vvt.a;
        vuz vuzVar = vuz.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", uvb.class, "c", ubu.u, "d", "e", "i"});
        }
        if (i2 == 3) {
            return new uuz();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uuz.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
