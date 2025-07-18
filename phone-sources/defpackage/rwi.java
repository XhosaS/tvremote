package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwi extends vuc implements vvk {
    public static final rwi a;
    private static volatile vvq l;
    public int b;
    public yzf c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public yzi j;
    public int k;
    private byte m = 2;
    public String i = "";

    static {
        rwi rwiVar = new rwi();
        a = rwiVar;
        vuc.y(rwi.class, rwiVar);
    }

    private rwi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new rwi();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rwi.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
