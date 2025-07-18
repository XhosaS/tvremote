package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wix extends vuc implements vvk {
    public static final wix a;
    private static volatile vvq r;
    public int b;
    public uch c;
    public uch d;
    public uch e;
    public uch f;
    public uch g;
    public uch h;
    public uch i;
    public uch j;
    public uch k;
    public boolean l;
    public uch m;
    public uch n;
    public uch o;
    public uch p;
    public uch q;

    static {
        wix wixVar = new wix();
        a = wixVar;
        vuc.y(wix.class, wixVar);
    }

    private wix() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဇ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new wix();
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
        vvq vvqVar = r;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wix.class) {
            vtxVar = r;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                r = vtxVar;
            }
        }
        return vtxVar;
    }
}
