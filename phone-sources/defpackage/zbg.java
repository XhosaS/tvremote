package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbg extends vuc implements vvk {
    public static final zbg a;
    private static volatile vvq e;
    public int b;
    public vtl c;
    public vtl d;
    private byte f = 2;

    static {
        zbg zbgVar = new zbg();
        a = zbgVar;
        vuc.y(zbg.class, zbgVar);
    }

    private zbg() {
        vuz vuzVar = vuz.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zbg();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zbg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
