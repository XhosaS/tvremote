package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjc extends vuc implements vvk {
    public static final vuk a = new qiu(15);
    public static final vjc b;
    private static volatile vvq n;
    public int c;
    public vkl e;
    public long f;
    public vki g;
    public int h;
    public vme i;
    public int k;
    public vmn m;
    public String d = "";
    public vuj j = vud.a;
    public vun l = vvt.a;

    static {
        vjc vjcVar = new vjc();
        b = vjcVar;
        vuc.y(vjc.class, vjcVar);
    }

    private vjc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\n\u0000\u0001\u0001\u0010\n\u0000\u0002\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\t᠌\u0005\nဉ\u0006\fࠬ\r᠌\u0007\u000f\u001b\u0010ဉ\t", new Object[]{"c", "d", "f", "e", "g", "h", vlj.e, "i", "j", vlj.f, "k", vid.i, "l", vko.class, "m"});
        }
        if (i2 == 3) {
            return new vjc();
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
        synchronized (vjc.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
