package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpb extends vuc implements vvk {
    public static final tpb a;
    private static volatile vvq n;
    public int b;
    public tpa e;
    public int j;
    public vuj k;
    public vuj l;
    public vsz m;
    public String c = "";
    public String d = "";
    public vun f = vvt.a;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        tpb tpbVar = new tpb();
        a = tpbVar;
        vuc.y(tpb.class, tpbVar);
    }

    private tpb() {
        vud vudVar = vud.a;
        this.k = vudVar;
        this.l = vudVar;
        this.m = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0003\u0000\u0001ဈ\u0000\u0003ဈ\u0003\u0004ဉ\u0004\u0005\u001b\u0006\u0016\bဈ\u0005\tဈ\u0006\nဈ\u0007\u000bင\b\f'\rည\t", new Object[]{"b", "c", "d", "e", "f", toy.class, "k", "g", "h", "i", "j", "l", "m"});
        }
        if (i2 == 3) {
            return new tpb();
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
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpb.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
