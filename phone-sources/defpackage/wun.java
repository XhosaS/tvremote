package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wun extends vuc implements vvk {
    public static final wun a;
    public static final vvd r;
    private static volatile vvq s;
    public wlx b;
    public wls c;
    public wls d;
    public woc e;
    public wll f;
    public boolean g;
    public boolean h;
    public wkg i;
    public wkg j;
    public wkg k;
    public boolean l;
    public boolean m;
    public boolean n;
    public wlx p;
    public float q;
    private int t;
    private byte u = 2;
    public vun o = vvt.a;

    static {
        wun wunVar = new wun();
        a = wunVar;
        vuc.y(wun.class, wunVar);
        r = vuc.C(wkx.a, wunVar, wunVar, 347930821, vwo.MESSAGE);
    }

    private wun() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.u);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0001\u0003\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007\tᐉ\b\u000bᐉ\n\fᐉ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0011\u001b\u0012ဉ\u000f\u0013ခ\u0010", new Object[]{"t", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", wni.class, "p", "q"});
        }
        if (i2 == 3) {
            return new wun();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.u = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = s;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wun.class) {
            vtxVar = s;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                s = vtxVar;
            }
        }
        return vtxVar;
    }
}
