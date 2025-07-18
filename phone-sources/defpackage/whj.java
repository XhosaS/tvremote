package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whj extends vuc implements vvk {
    public static final whj a;
    private static volatile vvq n;
    public int b;
    public long c;
    public vsz e;
    public vsz f;
    public whb g;
    public long h;
    public whl i;
    public whe j;
    public whi k;
    public boolean l;
    public long m;
    private byte o = 2;
    public String d = "";

    static {
        whj whjVar = new whj();
        a = whjVar;
        vuc.y(whj.class, whjVar);
    }

    private whj() {
        vvt vvtVar = vvt.a;
        vsz vszVar = vsz.b;
        vsz vszVar2 = vsz.b;
        this.e = vszVar2;
        this.f = vszVar2;
        this.h = 180000L;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0006ည\u0006\u0007ဉ\u000b\u000fတ\f\u0010ᐉ\r\u0012ဉ\u000f\u0013ဉ\u0010\u0014ဇ\u0011\u0015ဂ\u0012\u0016ည\t", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "f"});
        }
        if (i2 == 3) {
            return new whj();
        }
        if (i2 == 4) {
            return new vtw(a);
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
        synchronized (whj.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
