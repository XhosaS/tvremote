package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrx extends vuc implements vvk {
    public static final wrx a;
    public static final vvd l;
    private static volatile vvq m;
    public wlx b;
    public wls c;
    public wls d;
    public wll e;
    public wkg g;
    public wkg h;
    public int i;
    public wkg k;
    private int n;
    private byte o = 2;
    public String f = "";
    public String j = "";

    static {
        wrx wrxVar = new wrx();
        a = wrxVar;
        vuc.y(wrx.class, wrxVar);
        l = vuc.C(wkx.a, wrxVar, wrxVar, 351845665, vwo.MESSAGE);
    }

    private wrx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0000\u0003\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tင\b\u000bဈ\n\fᐉ\u000b", new Object[]{"n", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new wrx();
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
        synchronized (wrx.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
