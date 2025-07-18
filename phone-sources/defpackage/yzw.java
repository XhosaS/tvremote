package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzw extends vtz implements vua {
    public static final yzw a;
    private static volatile vvq m;
    public int b;
    public long d;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte n = 2;
    public String c = "";
    public String e = "";

    static {
        yzw yzwVar = new yzw();
        a = yzwVar;
        vuc.y(yzw.class, yzwVar);
    }

    private yzw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\u0007᠌\r\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", yyv.m, "d", "e"});
        }
        if (i2 == 3) {
            return new yzw();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzw.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
