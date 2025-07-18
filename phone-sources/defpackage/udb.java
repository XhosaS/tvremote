package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udb extends vuc implements vvk {
    public static final udb a;
    private static volatile vvq l;
    public int b;
    public uda c;
    public int e;
    public int h;
    public udg k;
    private byte m = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        udb udbVar = new udb();
        a = udbVar;
        vuc.y(udb.class, udbVar);
    }

    private udb() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new udb();
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
        synchronized (udb.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
