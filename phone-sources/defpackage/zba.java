package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zba extends vuc implements vvk {
    public static final zba a;
    private static volatile vvq z;
    private zal A;
    public int b;
    public long c;
    public yzn f;
    public zbb g;
    public yzs h;
    public zan i;
    public zaw j;
    public yyx k;
    public zat l;
    public yzv m;
    public yyt n;
    public yzg o;
    public zah p;
    public vun q;
    public zaq r;
    public vun s;
    public vun t;
    public zak u;
    public zaz v;
    public zar w;
    public yzi x;
    public zaj y;
    private byte B = 2;
    public String d = "";
    public String e = "";

    static {
        zba zbaVar = new zba();
        a = zbaVar;
        vuc.y(zba.class, zbaVar);
    }

    private zba() {
        vud vudVar = vud.a;
        vvt vvtVar = vvt.a;
        this.q = vvtVar;
        this.s = vvtVar;
        this.t = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.B);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0018\u0000\u0001\u0001'\u0018\u0000\u0003\n\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011\"\u001b%Л&\u001b'ဉ\u0014", new Object[]{"b", "f", "c", "d", "g", "u", "h", "i", "v", "j", "k", "l", "x", "m", "e", "y", "w", "A", "p", "r", "n", "t", yzj.class, "q", zbe.class, "s", zau.class, "o"});
        }
        if (i2 == 3) {
            return new zba();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.B = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = z;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zba.class) {
            vtxVar = z;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                z = vtxVar;
            }
        }
        return vtxVar;
    }
}
