package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zat extends vtz implements vua {
    public static final zat a;
    private static volatile vvq q;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public zax j;
    public int m;
    public int n;
    public int o;
    public zax p;
    private byte r = 2;
    public vun k = vvt.a;

    static {
        zat zatVar = new zat();
        a = zatVar;
        vuc.y(zat.class, zatVar);
    }

    private zat() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", zas.class, "m", "e", "g", "h", "j", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new zat();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = q;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zat.class) {
            vtxVar = q;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                q = vtxVar;
            }
        }
        return vtxVar;
    }
}
