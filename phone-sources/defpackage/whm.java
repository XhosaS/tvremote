package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whm extends vtz implements vua {
    public static final whm a;
    private static volatile vvq n;
    public int b;
    public long c;
    public long d;
    public int e;
    public vsz f;
    public long g;
    public vsz h;
    public boolean i;
    public String j;
    public double k;
    public who m;
    private byte o = 2;

    static {
        whm whmVar = new whm();
        a = whmVar;
        vuc.y(whm.class, whmVar);
    }

    private whm() {
        vvt vvtVar = vvt.a;
        vsz vszVar = vsz.b;
        vsz vszVar2 = vsz.b;
        this.f = vszVar2;
        this.g = 180000L;
        this.h = vszVar2;
        vud vudVar = vud.a;
        this.j = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\n\u0000\u0001\u0001!\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k", "m"});
        }
        if (i2 == 3) {
            return new whm();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (whm.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
