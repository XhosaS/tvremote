package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsu extends vuc implements vvk {
    public static final wsu a;
    public static final vvd l;
    private static volatile vvq m;
    public wlx b;
    public wlx c;
    public wls d;
    public wls f;
    public wls g;
    public wkg h;
    public wni i;
    public wsv j;
    private int n;
    private byte o = 2;
    public String e = "";
    public vun k = vvt.a;

    static {
        wsu wsuVar = new wsu();
        a = wsuVar;
        vuc.y(wsu.class, wsuVar);
        l = vuc.C(wkx.a, wsuVar, wsuVar, 525000015, vwo.MESSAGE);
    }

    private wsu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\n\u001b", new Object[]{"n", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", wni.class});
        }
        if (i2 == 3) {
            return new wsu();
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
        synchronized (wsu.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
