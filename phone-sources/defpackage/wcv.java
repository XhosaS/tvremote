package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcv extends vuc implements vvk {
    public static final wcv a;
    private static volatile vvq g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public long f;

    static {
        wcv wcvVar = new wcv();
        a = wcvVar;
        vuc.y(wcv.class, wcvVar);
    }

    private wcv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", vnk.m, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wcv();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wcv.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
