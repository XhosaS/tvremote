package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vft extends vuc implements vvk {
    public static final vft a;
    private static volatile vvq s;
    public String b = "";
    public int c;
    public int d;
    public vun e;
    public int f;
    public int g;
    public String h;
    public String i;
    public vfu j;
    public vfv k;
    public vun l;
    public vun m;
    public vfe n;
    public int o;
    public vun p;
    public long q;
    public vwe r;
    private int t;

    static {
        vft vftVar = new vft();
        a = vftVar;
        vuc.y(vft.class, vftVar);
    }

    private vft() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.h = "";
        this.i = "";
        this.l = vvtVar;
        this.m = vvtVar;
        this.p = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0011\u0000\u0001\u0001\u0018\u0011\u0000\u0004\u0000\u0001Ȉ\u0002\u0004\u0003Ț\u0004\u0004\u0005\u0004\u0006Ȉ\u0007Ȉ\bဉ\u0000\tဉ\u0002\n\f\f\u001b\u0010\u0002\u0011ဉ\u0003\u0012\u001b\u0013\f\u0015ဉ\u0001\u0018\u001b", new Object[]{"t", "b", "d", "e", "f", "g", "h", "i", "j", "n", "o", "l", vfc.class, "q", "r", "p", vfc.class, "c", "k", "m", vfc.class});
        }
        if (i2 == 3) {
            return new vft();
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
        vvq vvqVar = s;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vft.class) {
            vtxVar = s;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                s = vtxVar;
            }
        }
        return vtxVar;
    }
}
