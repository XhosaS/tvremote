package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiv extends vuc implements vvk {
    public static final wiv a;
    private static volatile vvq m;
    public int b;
    public int c;
    public wis d;
    public wit e;
    public wiu f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private wjc n;
    private byte o = 2;

    static {
        wiv wivVar = new wiv();
        a = wivVar;
        vuc.y(wiv.class, wivVar);
    }

    private wiv() {
        vsz vszVar = vsz.b;
        this.g = "";
        this.h = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0001\u0001င\u0000\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f", new Object[]{"b", "c", "n", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new wiv();
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
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wiv.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
